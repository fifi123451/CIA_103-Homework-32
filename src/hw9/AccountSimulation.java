package hw9;

public class AccountSimulation { // 定義帳戶模擬類別 AccountSimulation

    private static int balance = 0; // 帳戶餘額初始值
    private static final int DEPOSIT_AMOUNT = 2000; // 母親每次存款的金額，為 2000
    private static final int WITHDRAW_AMOUNT = 1000; // 熊大每次提款的金額，為 1000
    private static final int MAX_DEPOSITS = 10; // 母親最多存款的次數，為 10
    private static final int MAX_WITHDRAWS = 10; // 熊大最多提款的次數，為 10
    private static boolean programFinished = false; // 程式結束旗標

    public static void main(String[] args) { // 建立兩個執行緒 mother 和 bear 代表母親和熊大
        Thread mother = new Thread(new Mother());
        Thread bear = new Thread(new Bear());

        mother.start(); // 使用 start() 方法啟動這兩個執行緒
        bear.start();
    }

    // Mother 類別代表母親的存款行為
    static class Mother implements Runnable {
        @Override
        public void run() { // run 是 Mother 執行緒
            for (int i = 0; i < MAX_DEPOSITS; i++) {
                synchronized (AccountSimulation.class) { // synchronized 鎖定 AccountSimulation.class
                    while (balance >= 3000 && !programFinished) { // balance 大於或等於 3000，暫停匯款
                        System.out.println("媽媽看到餘額在3000以上，暫停匯款");
                        try {
                            AccountSimulation.class.wait(); // wait() 讓母親執行緒進入等待
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    
                    if (programFinished) {
                        return; // 程式結束後母親停止執行
                    }

                    // 存入 2000 元並顯示餘額
                    balance += DEPOSIT_AMOUNT;
                    System.out.println("媽媽存了2000，帳戶共有：" + balance);

                    // 通知熊大有新的存款
                    AccountSimulation.class.notifyAll(); // 呼叫 notifyAll() 喚醒等待中的熊大的執行緒
                }
            }
        }
    }

    // Bear 類別代表熊大的提款行為
    static class Bear implements Runnable {
        @Override
        public void run() {
            int withdrawCount = 0; // 計數熊大的提款次數
            while (withdrawCount < MAX_WITHDRAWS) {
                synchronized (AccountSimulation.class) {
                    while (balance < WITHDRAW_AMOUNT) { // 如果餘額不足，暫停提款
                        System.out.println("媽媽被熊大要求匯款!");
                        try {
                            AccountSimulation.class.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    // 判斷條件，當熊大達到最大提款次數並且餘額符合條件時，結束程式
                    if (withdrawCount == MAX_WITHDRAWS - 1 && balance >= WITHDRAW_AMOUNT) {
                        balance -= WITHDRAW_AMOUNT;
                        System.out.println("熊大領了1000，帳戶共有：" + balance);
                        System.out.println("程式結束");
                        programFinished = true;
                        AccountSimulation.class.notifyAll(); // 通知母親程式已結束
                        return;
                    }

                    // 執行提款並增加提款次數
                    balance -= WITHDRAW_AMOUNT;
                    withdrawCount++;
                    System.out.println("熊大領了1000，帳戶共有：" + balance);

                    // 檢查餘額，並在低於 2000 時要求匯款
                    if (balance < 2000 && balance > 0) {
                        System.out.println("熊大看到餘額在2000以下，要求匯款");
                    }

                    AccountSimulation.class.notifyAll(); // 通知媽媽熊大已提款
                }
            }
        }
    }
}
