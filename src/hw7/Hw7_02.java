package hw7;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
public class Hw7_02 {
	
//	請寫一隻程式，能夠亂數產生10個1～1000的整數，並寫入一個名為Data.txt的檔案裡(請使用
//			append功能讓每次執行結果都能被保存起來)	

	
	

	    public static void main(String[] args) {
	        Random random = new Random(); // 建立一個 Random 物件來生成隨機數
	        String fileName = "Data.txt"; // 檔案名稱

	        try (FileWriter writer = new FileWriter(fileName, true)) { // 打開檔案並啟用附加模式（append = true）
	            for (int i = 0; i < 10; i++) {
	                int randomNumber = random.nextInt(1000) + 1; // 產生 1 到 1000 之間的亂數
	                writer.write(randomNumber + "\n"); // 將亂數寫入檔案，並換行
	            }
	            System.out.println("隨機數已成功寫入 " + fileName);
	        } catch (IOException e) {
	            System.out.println("寫入檔案時發生錯誤: " + e.getMessage());
	        }
	    
	}

}
