	package hw9;
	import java.util.Random;

	public class EatingContest {

//開啓2個執行緒模擬饅頭人與詹姆士參加快胃王比賽所做的競賽過程。
//每個動作都以Thread.sleep()暫停一下,以達到顯示效果。
//Sleep時間由亂數產生500～3000之間的毫秒數，參考範例：CounterRunnable.java
//需留意主執行緒執行順序
	


	    //  內部類別Contestant
	    static class Contestant implements Runnable {
	        private String name;
	        private int totalBowls;
	        private Random random;

	        public Contestant(String name, int totalBowls) {
	            this.name = name;
	            this.totalBowls = totalBowls;
	            this.random = new Random();
	        }

	        @Override
	        public void run() {
	            for (int i = 1; i <= totalBowls; i++) {
	                try {
	                    // 模擬吃飯，每次睡眠隨機時間 500 到 3000 毫秒
	                    int sleepTime = random.nextInt(2500) + 500;
	                    Thread.sleep(sleepTime);
	                    System.out.println(name + " 吃第 " + i + " 碗飯");
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	            System.out.println(name + " 吃完了！");
	        }
	    }

	    public static void main(String[] args) {
	        System.out.println("----- 大胃王快食比賽開始！ -----");

	        // 創建兩個參賽者的執行緒
	        Thread contestant1 = new Thread(new Contestant("餵頭人", 10));
	        Thread contestant2 = new Thread(new Contestant("詹姆士", 10));

	        // 啟動兩個執行緒
	        contestant1.start();
	        contestant2.start();

	        try {
	            // 主執行緒等待兩個參賽者都完成
	            contestant1.join();
	            contestant2.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        System.out.println("----- 大胃王快食比賽結束！ -----");
	    }
	}
