package hw1;

public class Hw2 {
	public static void main(String[] args) {

//請設計一隻Java程式，計算1～1000的偶數和 (2+4+6+8+…+1000)
		int sum = 0;
		for (int count = 1; count <= 100; count++) {
			if (count % 2 == 0)
				System.out.println("1到1000的偶數總和是: " + sum);
		}

//請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用for迴圈)
		// for (i = 1; i <= 10; i++) {
		// System.out.print("1到10的連乘積是: " + i);
		System.out.println();
//	}	
		int product = 1; // 初始化連乘積變數為1

		// 使用for迴圈計算1到10的連乘積
		for (int i = 1; i <= 10; i++) {
			product *= i; // 將product與當前的i相乘
		}

		// 輸出結果
		System.out.println("1到10的連乘積是: " + product);
		// }

//請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用while迴圈)

		// int product = 1; // 初始化連乘積變數為1
		// int i = 1; // 初始化迴圈控制變數為1

		// 使用while迴圈計算1到10的連乘積
		// while (i <= 10) {
		// product *= i; // 將product與當前的i相乘
		// i++; // 增加i的值
		// }

		// 輸出結果
		// System.out.println("1到10的連乘積是: " + product);
		// }
		// }

//請設計一隻Java程式，輸出結果為以下：1 4 9 16 25 36 49 64 81 100

		// 使用for迴圈遍歷從1到10的數字
		for (int i = 1; i <= 10; i++) {
			int square = i * i; // 計算i的平方值
			System.out.print(square + " "); // 輸出平方值，並在數字後加上空格
		}
	}
}

//}
