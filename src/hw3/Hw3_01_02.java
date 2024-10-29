package hw3;

import java.util.Scanner;

public class Hw3_01_02 {

	//(進階功能：加入直角三角形的判斷)    
	//畢氏定理：利用 a² + b² = c² 判斷是否為直角三角形，其中 c 是最大的邊。

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
	                System.out.println("這是一個正三角形！");
	            } else if (a == b || b == c || a == c) {
	                System.out.println("這是一個等腰三角形！");
	            } else {
	                System.out.println("這是一個其他三角形！");
	            }

	            // 檢查是否為直角三角形，必須將最大的邊放在c上
	            if (isRightTriangle(a, b, c)) {
	                System.out.println("這也是一個直角三角形！");
	            }
	        } else {
	            // 不是三角形
	            System.out.println("這不是一個三角形！");
	        }

	        scanner.close();
	    }

		private static boolean isRightTriangle(int a, int b, int c) {
			// TODO Auto-generated method stub
			return false;
		}
		
	    // 判斷是否為直角三角形的方法
	    public static boolean isRightTriangle1(int a, int b, int c) {
	        // 找出最大邊，並將它視為直角三角形的斜邊
	        if (a > b && a > c) {
	            return a * a == b * b + c * c;
	        } else if (b > a && b > c) {
	            return b * b == a * a + c * c;
	        } else {
	            return c * c == a * a + b * b;
	        }
	    }

	}

