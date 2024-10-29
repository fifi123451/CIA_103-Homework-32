package hw3;

import java.util.Scanner;

public class Hw3_04 {
	
	//透過Math類別的靜態方法random()，可以自動產生隨機的數字
	//用法參考如圖所示
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

			// 輸入範圍
			System.out.print("請輸入最小值: ");
			int min = scanner.nextInt();
			System.out.print("請輸入最大值: ");
			int max = scanner.nextInt();

			// 生成隨機數字
			int randomNumber = A(min, max);
			System.out.println("隨機產生的數字是: " + randomNumber);

			scanner.close();
		}

		public static int A(int min, int max) {
			return min + (int) (Math.random() * (max - min + 1));

		}
	}



