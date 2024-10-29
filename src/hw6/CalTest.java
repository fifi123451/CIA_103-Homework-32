package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = 0, y = 0;

		try {
			// 提示使用者輸入 x 值
			System.out.print("請輸入 x 的值：");
			x = scanner.nextInt();

			// 提示使用者輸入 y 值
			System.out.print("請輸入 y 的值：");
			y = scanner.nextInt();

			// 計算並顯示結果
			double result = Calculator.powerXY(x, y);
			System.out.println(x + " 的 " + y + " 次方等於 " + (int) result);

		} catch (CalException e) {
			// 捕捉自訂例外並顯示訊息
			System.out.println(e.getMessage());

		} catch (InputMismatchException e) {
			// 捕捉輸入格式錯誤（非整數輸入）
			System.out.println("輸入格式不正確");

		} finally {
			scanner.close();
		}

	}
}
