package hw4;

//import java.util.Scanner;
import java.util.Arrays;																							

public class Hw4_01 {

		
//	有個一維陣列如下：{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//	請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//	(提示：陣列，length屬性)

	public static void main(String[] args) {
        int[] array = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
        int sum = 0;
        int length = array.length;

        // 計算總和
        for (int i = 0; i < length; i++) {
            sum += array[i];
        }

        // 計算平均值
        double average = (double) sum / length;
        System.out.println("平均值: " + average);

        // 找出並輸出大於平均值的元素
        System.out.println("大於平均值的元素: ");
        for (int i = 0; i < length; i++) {
            if (array[i] > average) {
                System.out.println(array[i]);
            }
        }
    }
}



	




