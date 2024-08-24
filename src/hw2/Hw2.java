package hw2;

public class Hw2 {
	// 請設計一隻Java程式，計算1～1000的偶數和 (2+4+6+8+…+1000)
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0)
				;
			sum += i;
			System.out.println("1到1000的偶數總和是: " + sum);

		}
		System.out.print("=============");

		// 請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用for迴圈)
		int product = 1;
		{
			for (int j = 1; j <= 10; j++) {
				product *= j;
				System.out.print("=============");
			}
			System.out.print("1到10的連乘積是: " + product);

			// 請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用while迴圈)

			product = 0; // 初始化連乘積變數為0,防止跟上題product =1重複
			int i = 1; // 初始化迴圈控制變數為1
			// 使用while迴圈計算1到10的連乘積
			while (i <= 10) {
				product *= i; // 將product與當前的i相乘
				i++; // 增加i的值
				System.out.println("1到10的連乘積是: " + product);
			}

			// 請設計一隻Java程式，輸出結果為以下：1 4 9 16 25 36 49 64 81 100
			for (int a = 1; a <= 10; a++) {// 計算平方數
				// 輸出結果
				System.out.print(a * a + " ");
			}

			// 使用for迴圈遍歷從1到10的數字
			for (int i1 = 1; i1 <= 10; i1++) {
				int square = i1 * i1; // 計算i的平方值
				System.out.print(square + " ");
			} // 輸出平方值，並在數字後加上空格

//阿文很熱衷大樂透 (1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
//輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
			sum = 0;
			for (int x = 0; x < 4; x++) {
				for (int y = 0; y <= 9; y++) {
					if (y == 4)
						continue;
					System.out.print(10 * x + y + " ");
					sum++;
					System.out.print("總共" + sum + "個");
				}
				System.out.print("=============");
				// • 請設計一隻Java程式，輸出結果為以下：
				// 1 2 3 4 5 6 7 8 9 10
				// 1 2 3 4 5 6 7 8 9
				// 1 2 3 4 5 6 7 8
				// 1 2 3 4 5 6 7
				// 1 2 3 4 5 6
				// 1 2 3 4 5
				// 1 2 3 4
				// 1 2 3
				// 1 2
				// 1
				for (int a = 10; a > 0; a--) {
					for (int b = 1; b <= a; b++)
						System.out.print(b + " ");
				}
			}
			System.out.print("=============");
			// • 請設計一隻Java程式，輸出結果為以下：
			// A
			// BB
			// CCC
			// DDDD
			// EEEEE
			// FFFFFF
			char c = 'A' - 1;
			for (int b = 1; b <= 6; b++) {
				c++;
				for (int j = 1; j <= i; j++) {
					System.out.print(1);
				}
			}
		}
	}
}
