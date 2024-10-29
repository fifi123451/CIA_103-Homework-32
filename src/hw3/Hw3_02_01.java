package hw3;

import java.util.Random;
import java.util.Scanner;

public class Hw3_02_01 {
	//請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜
	//對則顯示正確訊息，如圖示結果：(提示：Scanner，亂數方法，無窮迴圈)

	    public static void main(String[] args) {
	        // 步驟1: 產生隨機數字
	        Random random = new Random();
	        int randomNumber = random.nextInt(10); // 產生 0 到 9 的隨機數字

	        // 步驟2: 用戶輸入
	        Scanner scanner = new Scanner(System.in);
	        int guess; // 儲存用戶的猜測
	        boolean correct = false; // 用來判斷猜測是否正確

	        // 步驟3: 進行猜數字遊戲
	        while (!correct) {
	            System.out.print("請猜一個 0 到 9 的數字: ");
	            guess = scanner.nextInt(); // 讀取用戶輸入的數字
	
	            // 步驟4: 檢查用戶的猜測是否正確
	            if (guess == randomNumber) {
	                System.out.println("恭喜！你猜對了！");
	                correct = true; // 結束循環
	            } else {
	                System.out.println("猜錯了，請再試一次！");
	            }
	        }
	        scanner.close();
	    }
	}

	
