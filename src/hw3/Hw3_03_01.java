package hw3;

import java.util.Scanner;

public class Hw3_03_01 {

	//阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
	//厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
	//的號碼與總數，如圖：(提示：Scanner)

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // 提示阿文輸入他不喜歡的數字
	        System.out.print("阿文,請輸入你討厭的數字(1～9)：");
	        int num1 = scanner.nextInt();

	       
			// 檢查輸入的數字是否在1到9之間
	        if (num1 < 1 || num1 > 9) {
	            System.out.println("輸入錯誤，請輸入1到9之間的數字！");
	        } else {
	            System.out.println("你討厭的數字是：" + num1);
	            System.out.println("你可以選擇的號碼有：");

	            int count = 0;

	            // 遍歷1到49的號碼，排除包含阿文不喜歡的數字
	            for (int i = 1; i <= 49; i++) {
	                // 將數字轉為字串，判斷是否包含不喜歡的數字
	                if (!String.valueOf(i).contains(String.valueOf(num1))) {
	                    System.out.print(i + " ");
	                    count++;
	                }
	            }

	            // 顯示可選號碼的總數
	            System.out.println("\n總共可以選擇的號碼數量：" + count);
	        }

	        scanner.close();
	    }
	}

