// 請設計一隻Java程式，計算12，6這兩個數值的和與積	

package hw1;

public class Hw1 {

	public static void main(String[] args) {
		int num1 = 12, num2 = 6;

		System.out.println(num1 + num2);
		System.out.println(num1 * num2);

		// 請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)
// 定義蛋的總數和每打的蛋數//計算幾打和剩餘幾顆

		int totalEggs = 200;
		int eggsPerDozen = 12;

		int a = totalEggs / eggsPerDozen;
		int b = totalEggs % eggsPerDozen;
		System.out.println(a);
		System.out.println(b);

//請由程式算出256559秒為多少天、多少小時、多少分與多少秒

		int totalSeconds = 256559; // 總秒數

		// 定義常數
		final int SECONDS_IN_A_DAY = 86400; // 一天的秒數
		final int SECONDS_IN_AN_HOUR = 3600; // 一小時的秒數
		final int SECONDS_IN_A_MINUTE = 60; // 一分鐘的秒數

		// 計算天數
		int days = totalSeconds / SECONDS_IN_A_DAY;
		// 計算剩餘秒數
		int remainingSeconds = totalSeconds % SECONDS_IN_A_DAY;

		// 計算小時數
		int hours = remainingSeconds / SECONDS_IN_AN_HOUR;
		// 計算剩餘秒數
		remainingSeconds = remainingSeconds % SECONDS_IN_AN_HOUR;

		// 計算分鐘數
		int minutes = remainingSeconds / SECONDS_IN_A_MINUTE;
		// 剩餘的秒數
		int seconds = remainingSeconds % SECONDS_IN_A_MINUTE;

		// 輸出結果
		System.out.println(totalSeconds + "秒等於 " + days + " 天 " + hours + " 小時 " + minutes + " 分鐘 " + seconds + " 秒");

//請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
//圓面積公式為圓周率×半徑×半徑, 圓周長公式為直徑x圓周率

		final double PI = 3.1415;
		double radius = 5.0;
		double area = PI * radius * radius;
		double circumference = 2 * PI * radius;
		System.out.println("半徑為 " + radius + " 的圓:");
		System.out.println("面積是: " + area);
		System.out.println("圓周長是: " + circumference);

//某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行, 請用程式計算10年後,本金加利息共有多少錢錢 (用複利計算)
		double principal = 1500000;
		double rate = 0.02;
		int years = 10;
		double amount = principal * Math.pow(1 + rate, years);

		System.out.printf("10年后本金加利息共有: %.2f 元%n", amount);

//請寫一隻程式，利用System.out.println()印出以下三個運算式結果：並請用註解各別說明答案的產生原因
//5 + 5
//5為是兩個整數int相加，結果為10		
		System.out.println(5 + 5);
//5 + ‘5’
//5 是一個int型態,'5'為char型態，char轉成Unicode對應值，因此 5 + '5' 其實是 5 + 53，結果為 58
		System.out.println(5 + '5');
//5 + “5”
//5 是一個int型態,"5" 是一個strung型態，然後兩個字串會被串接，結果為 "55"
		System.out.println(5 + "5");

	}
}