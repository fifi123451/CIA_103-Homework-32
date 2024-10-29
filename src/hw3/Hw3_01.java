package hw3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Hw3_01 {

//	 請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰
//	 三角形、其它三角形或不是三角形，如圖示結果：

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 提示使用者輸入三個數字
        System.out.println("請輸入三個整數作為三角形的邊長：");

        // 接收輸入的三個數字
        System.out.print("輸入第一個數字：");
        int a = scanner.nextInt();
        System.out.print("輸入第二個數字：");
        int b = scanner.nextInt();
        System.out.print("輸入第三個數字：");
        int c = scanner.nextInt();

        // 檢查是否為三角形
        if (a + b > c && a + c > b && b + c > a) {
            // 如果是三角形，進一步檢查是哪種三角形
            if (a == b && b == c) {
                System.out.println("正三角形");
            } else if (a == b || b == c || a == c) {
                System.out.println("等腰三角形");
            } else {
                System.out.println("其他三角形");
            }
        } else {
            // 如果不是三角形
            System.out.println("不是三角形");
        }

        scanner.close();
    }

}










