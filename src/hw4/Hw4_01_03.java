package hw4;

public class Hw4_01_03 {

	// 有個字串陣列如下(八大行星)：
//	{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//	請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u) (提示：字元比對，String方法)

	public static void main(String[] args) {
		// 定義八大行星的字串陣列
		String[] planets = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };

		// 定義母音字元
		String vowels = "aeiouAEIOU";
		int vowelCount = 0;

		// 遍歷每個行星字串
		for (String planet : planets) {
			// 遍歷每個字串中的字元
			for (int i = 0; i < planet.length(); i++) {
				// 檢查該字元是否為母音
				if (vowels.indexOf(planet.charAt(i)) != -1) {
					vowelCount++;
				}
			}
		}

		// 輸出母音的總數
		System.out.println("八大行星中的母音總數: " + vowelCount);
	}

}
