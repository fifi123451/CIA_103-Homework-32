package hw4;

import java.util.Scanner;

public class Hw4_02 {

//	 阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有5 個,其員工編號與身上現金列
//	 表如下：請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事有錢可借他;
//	 並且統計有錢可借的總人數:例如輸入1000 就顯示「有錢可借的員工編號: 25 19 27 共3 人!」
//	 (提示：Scanner，二維陣列)

	public static void main(String[] args) {
		// 設定員工編號和對應的現金金額（使用二維陣列）
		int[][] employees = { { 25, 1200 }, { 19, 800 }, { 27, 1500 }, { 33, 900 }, { 45, 2000 } };

		// 建立 Scanner 來接收使用者輸入
		Scanner scanner = new Scanner(System.in);

		// 小華輸入欲借的金額
		System.out.print("請輸入欲借的金額: ");
		int borrowAmount = scanner.nextInt();

		// 記錄有錢可借的同事及其數量
		int count = 0;
		System.out.print("有錢可借的員工編號: ");

		// 二維陣列，檢查哪些員工有足夠的現金
		for (int i = 0; i < employees.length; i++) {
			if (employees[i][1] >= borrowAmount) {
				System.out.print(employees[i][0] + " ");
				count++;
			}
		}

		// 輸出總共有多少人有錢可借
		System.out.println("共 " + count + " 人!");

		scanner.close();

	}
}
