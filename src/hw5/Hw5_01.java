package hw5;

import java.util.Scanner;
import java.util.Random;

public class Hw5_01 {
	
//	 請設計一個方法為starSquare(int width, int height)，當使用者鍵盤輸入寬與高時
//	 即會印出對應的*長方形

	    public static void main(String[] args) {
	    
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("請輸入寬與高：");

	        // 接收寬度與高度
	        int width = scanner.nextInt();
	        int height = scanner.nextInt();

	       p(width, height);
	    }

	    // 印出矩形的函式
	    public static void p(int width, int height) {
	        // 外層迴圈控制行數（高度）
	        for (int i = 0; i < height; i++) {
	            // 內層迴圈控制每行的星號數量（寬度）
	            for (int j = 0; j < width; j++) {
	                System.out.print("*"); 
	            }
	            System.out.println(); 
	        }
	    }
	}



