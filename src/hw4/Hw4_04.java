package hw4;

public class Hw4_04 {
//	 班上有8位同學，他們進行了6次考試結果
//	請算出每位同學考最高分的次數//	 (提示：二維陣列)

	    public static void main(String[] args) {
	        int[][] x = {
	            {10, 37, 100, 77, 98, 90},  // 學生1
	            {35, 75, 70, 95, 70, 80},   // 學生2
	            {40, 77, 79, 70, 89, 100},  // 學生3
	            {100, 89, 90, 89, 90, 75},  // 學生4
	            {90, 64, 75, 60, 75, 50},   // 學生5
	            {85, 75, 70, 75, 90, 20},   // 學生6
	            {75, 70, 79, 85, 89, 99},   // 學生7
	            {70, 95, 90, 89, 90, 75}    // 學生8
	        };

	        // 統計每位同學考到最高分的次數
	        int[] Counts = new int[8];  // 8位學生

	        // 遍歷每次考試，找出該次考試的最高分
	        for (int exam = 0; exam < 6; exam++) {  // 每次考試
	            int max = 0;
	            
	            // 找到該次考試的最高分
	            for (int student = 0; student < 8; student++) {
	                if (x[student][exam] > max) {
	                    max = x[student][exam];
	                }
	            }

	            // 統計哪些學生獲得了最高分
	            for (int student = 0; student < 8; student++) {
	                if (x[student][exam] == max) {
	                    Counts[student]++;
	                }
	            }
	        }

	        // 輸出結果
	        System.out.printf("1號%d次, 2號%d次, 3號%d次, 4號%d次, 5號%d次, 6號%d次, 7號%d次, 8號%d次", 
	        				Counts[0], Counts[1], Counts[2], Counts[3], Counts[4],Counts[5], Counts[6], Counts[7]);
	    }
	}


