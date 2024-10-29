package hw4;

import java.util.Scanner;

public class Hw4_03 {
	
//	 請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
//	 例：輸入1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
//	 (提示1：Scanner，陣列)
//	 (提示2：需將閏年條件加入)
//	 (提示3：擋下錯誤輸入：例如月份輸入為2，則日期不該超過29)

	    
	    // 檢查是否為閏年
	    public static boolean isLeapYear(int year) {
	        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // 每月的天數 (平年)
	        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	        
	        // 提示輸入
	        System.out.println("請輸入西元年 (yyyy):");
	        int year = scanner.nextInt();
	        
	        System.out.println("請輸入月份 (mm):");
	        int month = scanner.nextInt();
	        
	        System.out.println("請輸入日期 (dd):");
	        int day = scanner.nextInt();
	        
	        // 檢查是否為閏年，若是則2月有29天
	        if (isLeapYear(year)) {
	            daysInMonth[1] = 29;
	        }
	        
	        // 檢查輸入的月份和日期是否合法
	        if (month < 1 || month > 12) {
	            System.out.println("月份輸入錯誤！");
	            return;
	        }
	        
	        if (day < 1 || day > daysInMonth[month - 1]) {
	            System.out.println("日期輸入錯誤！");
	            return;
	        }
	        
	        // 計算該日為當年第幾天
	        int dayOfYear = 0;
	        for (int i = 0; i < month - 1; i++) {
	            dayOfYear += daysInMonth[i];
	        }
	        dayOfYear += day;
	        
	        // 輸出結果
	        System.out.println("輸入的日期為該年第 " + dayOfYear + " 天");
	    }
	}

//程式說明：
//isLeapYear(): 用來判斷是否為閏年。
//daysInMonth: 用來儲存平年的每月天數，當輸入的年份為閏年時，會將2月的天數更新為29天。
//程式會根據用戶輸入的年、月、日進行合法性檢查，若輸入錯誤則會提示錯誤訊息。


