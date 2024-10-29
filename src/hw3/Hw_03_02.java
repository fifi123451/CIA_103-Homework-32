package hw3;

import java.util.Random;
import java.util.Scanner;

public class Hw_03_02 {
	// (進階功能：產生0～100亂數，每次猜就會提示你是大於還是小於正確答案)
	
	public static void main(String[] args) {
		Random random = new Random();
        int targetNumber = random.nextInt(101); // 生成0到100的隨機數
        Scanner scanner = new Scanner(System.in);
        int guess = -1;

        System.out.println("猜一個0到100之間的數字：");

        while (guess != targetNumber) {
            System.out.print("你的猜測是：");
            guess = scanner.nextInt();

            if (guess < targetNumber) {
                System.out.println("太小了！再試一次。");
            } else if (guess > targetNumber) {
                System.out.println("太大了！再試一次。");
            } else {
                System.out.println("恭喜！你猜對了！");
            }
        }

        scanner.close();
    }
}
		
