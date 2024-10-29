package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Hw7_01 {

    public static void main(String[] args) {
        // 建立 File 物件，使用相對路徑或絕對路徑
    	File f = new File("src/hw7/Sample.txt");


        int byteCount = 0; 
        int charCount = 0; 
        int lineCount = 0; 

        try (BufferedReader reader = new BufferedReader(new FileReader(f))) {
            String line;
            // 逐行讀取檔案
            while ((line = reader.readLine()) != null) {
                lineCount++; // 計算行數
                charCount += line.length(); // 計算字元數
                byteCount += line.getBytes().length; // 計算位元組數
            }
        } catch (IOException e) {
            // 檔案讀取發生錯誤時，輸出錯誤訊息
            System.out.println("讀取檔案時發生錯誤: " + e.getMessage());
        }

        // 輸出結果
        System.out.println("Sample.txt檔案共有 " + byteCount + " 個位元組，" 
                + charCount + " 個字元，" + lineCount + " 列資料。");
    }
}



//	程式解釋：
//	匯入必要的類：
//
//	BufferedReader 和 FileReader 用於讀取檔案。
//	IOException 用於處理可能出現的檔案讀取錯誤。
//	設定檔案路徑：
//
//	String filePath = "Sample.txt";：這一行設定要讀取的檔案路徑。
//	變數初始化：
//
//	byteCount：用來計算檔案的位元組數。
//	charCount：用來計算檔案的字元數。
//	lineCount：用來計算檔案的行數。
//	讀取檔案：
//
//	使用 BufferedReader 讀取檔案內容，並在 while 循環中逐行讀取。
//	每次讀取一行後，增加行數計數器 lineCount，並累加該行的字元數和位元組數。
//	錯誤處理：
//
//	使用 try-catch 語句來捕捉並處理可能發生的 IOException。
//	輸出結果：
//
//	使用 System.out.println 輸出檔案的位元組數、字元數和行數。
//	檔案位置
//	確保 Sample.txt 檔案與你的 Java 程式碼在同一資料夾中，或者在程式中提供正確的路徑。例如，如果 Sample.txt 在 src 資料夾中，則你需要將 filePath 設定為 "src/Sample.txt"。
//
//	這樣，你就可以執行程式來讀取 Sample.txt，並獲得檔案的大小、字元數和行數的資訊。