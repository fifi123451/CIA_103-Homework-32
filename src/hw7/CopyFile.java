//package hw7;
//
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//
//public class HW7_03 {
//	
////下面是一個 Java 程式，包含一個名為 copyFile 的方法
////它有兩個參數：sourcePath 和 destinationPath，分別代表來源檔案和目的地檔案
////此方法會將來源檔案的內容複製到目的地檔案。
//// copyFile方法，接收兩個參數：來源檔案路徑和目的地檔案路徑
//	    public static void copyFile(String sourcePath, String destinationPath) {
//	        try (
//	            FileInputStream inputStream = new FileInputStream(sourcePath); // 建立輸入流來讀取來源檔案
//	            FileOutputStream outputStream = new FileOutputStream(destinationPath) // 建立輸出流來寫入目標檔案
//	        ) {
//	            byte[] buffer = new byte[1024]; // 建立一個緩衝區，大小為 1024 bytes
//	            int length;
//	            // 從來源檔案讀取資料，並寫入到目的地檔案中
//	            while ((length = inputStream.read(buffer)) > 0) {
//	                outputStream.write(buffer, 0, length); // 將每次讀取的資料寫入
//	            }
//	            System.out.println("檔案複製成功！"); // 複製成功時輸出訊息
//	        } catch (IOException e) {
//	            // 捕捉例外情況並輸出錯誤訊息
//	            System.out.println("檔案複製失敗: " + e.getMessage());
//	        }
//	    }
//
//	    public static void main(String[] args) {
//	        // 呼叫 copyFile 方法，指定來源檔案和目的地檔案的路徑
//	        String sourceFile = "source.txt"; // 來源檔案的路徑
//	        String destinationFile = "destination.txt"; // 目的地檔案的路徑
//	        copyFile(sourceFile, destinationFile); // 呼叫 copyFile 方法進行檔案複製
//	    }
//	}


package hw7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
//		請從無到有試著完成一個方法名為copyFile，這個方法有兩個參數。呼叫此方法時，第一個參數所
//		代表的檔案會複製到第二個參數代表的檔案
		
		copyFile("C:/Users/Acer EX-14/Desktop/java/HW7/input.txt","C:/Users/Acer EX-14/Desktop/java/HW7/output.txt");
	}
	public static void copyFile(String sourcePath, String destinationPath) throws IOException {
		
		File input= new File(sourcePath);
		File output= new File(destinationPath);
		if (!input.exists()) {
            throw new IOException("來源檔案不存在: " + sourcePath);
        }
		else {
			FileReader fr = new FileReader(input);
			BufferedReader bfr = new BufferedReader(fr);
			FileWriter fw = new FileWriter(output);
			BufferedWriter bfw = new BufferedWriter(fw);
			int c;
			while((c=bfr.read())!=-1){
				bfw.write(c);
				System.out.flush();
			}

			bfw.close();
			fw.close();
			bfr.close();
			fr.close();					
	}

}
}

