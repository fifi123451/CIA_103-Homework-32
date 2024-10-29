package hw3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Hw3_03_02 {

	// (進階挑戰：輸入不要的數字後，直接亂數印出6個號碼且不得重複)

  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      // 提示阿文輸入他不喜歡的數字
     System.out.print("請輸入你不喜歡的數字(1～9)：");
      int num1 = scanner.nextInt();

     // 檢查輸入的數字是否在1到9之間
      if (num1 < 1 || num1 > 9) {
          System.out.println("輸入錯誤，請輸入1到9之間的數字！");
      } else {
          System.out.println("你不喜歡的數字是：" + num1);

          // 建立可選號碼的列表
          List<Integer> availableNumbers = new ArrayList<>();

         // 1到49的號碼，排除包含阿文不喜歡的數字
         for (int i = 1; i <= 49; i++) {
              if (!String.valueOf(i).contains(String.valueOf(num1))) {
                  availableNumbers.add(i);
             }
          }
         // 檢查是否有足夠的號碼讓阿文選擇
          if (availableNumbers.size() < 6) {
             System.out.println("可選的號碼不足6個！");
          } else {
              System.out.println("從可選的號碼中隨機選出6個：");

              // 用亂數隨機選取6個不同的號碼
              Random random = new Random();
              List<Integer> selectedNumbers = new ArrayList<>();

              while (selectedNumbers.size() < 6) {
                  int randomIndex = random.nextInt(availableNumbers.size());
                 int selectedNumber = availableNumbers.get(randomIndex);

                 // 防止重複選號
                  if (!selectedNumbers.contains(selectedNumber)) {
                      selectedNumbers.add(selectedNumber);
                  }
              }
              // 顯示選中的號碼
              for (int number : selectedNumbers) {
                  System.out.print(number + " ");
              }
              System.out.println(); // 換行
         }
      }
      scanner.close(); 
  }
}

