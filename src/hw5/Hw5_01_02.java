package hw5;

import java.util.Random;

public class Hw5_01_02 {
	//請設計一個方法為randAvg()，從10個0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值

    public static void main(String[] args) {
        // 呼叫 randAvg 方法
        randAvg();
    }

    public static void randAvg() {
        
        Random random = new Random();

        int sum = 0;

        int[] numbers = new int[10];

        // 生成 10 個隨機數，範圍 0 ~ 100
        System.out.println("本次亂數結果：");
        for (int i = 0; i < 10; i++) {
            // 產生隨機數並儲存到陣列中
            numbers[i] = random.nextInt(101);  // 0 ~ 100 的範圍
            sum += numbers[i];  // 累加到總和中
            System.out.print(numbers[i] + " ");  // 輸出隨機數
        }

        // 計算平均值
        double average = sum / 10.0;

        // 換行印出平均值
        System.out.println("\n平均值：" + average);
    }
}


