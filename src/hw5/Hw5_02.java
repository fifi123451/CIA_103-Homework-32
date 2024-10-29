package hw5;

public class Hw5_02 {

	// 尋找整數二維陣列中的最大元素的方法
	public int maxElement(int[][] x) {
		int max = x[0][0]; // 將最大值初始化為第一個元素
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] > max) {
					max = x[i][j]; // 更新最大值的元素
				}
			}
		}
		return max;
	}

	// 尋找浮點數二維陣列中的最大元素的方法
	public double maxElement(double[][] x) {
		double max = x[0][0]; // 將最大值初始化為第一個元素
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] > max) {
					max = x[i][j]; // 若發現較大的元素則更新最大值
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {

		// 創建 Hw5_02 類別的實例
		Hw5_02 w = new Hw5_02();

		// 定義整數二維陣列
		int[][] intArray = { { 1, 6, 3 }, { 9, 5, 2 } };

		// 定義浮點數二維陣列
		double[][] doubleArray = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };

		// 列印出每個陣列中的最大元素
		System.out.println(w.maxElement(intArray)); // 輸出: 9
		System.out.println(w.maxElement(doubleArray)); // 輸出: 8.2
	}
}
