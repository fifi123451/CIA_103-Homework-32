package hw7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// 非靜態內部類別
//	請寫一支程式，利用老師提供的Dog與Cat類別分別產生兩個物件，寫到C:\data\Object.ser裡。
//	注意物件寫入需注意的事項，若C:\內沒有data資料夾，請用程式新增這個資料夾
public class Hw7_04 {

	
	public static void main(String[] args) {

		// 創建 Dog 和 Cat 物件
		Dog dog1 = new Dog("Rex");
		Dog dog2 = new Dog("Buddy");
		Cat cat1 = new Cat("Whiskers");
		Cat cat2 = new Cat("Mittens");

		// 將物件序列化並寫入到 Object.ser 檔案
		String filePath = "C:\\data\\Object.ser";
		try (FileOutputStream fileOut = new FileOutputStream(filePath);
				ObjectOutputStream out = new ObjectOutputStream(fileOut)) {

			out.writeObject(dog1);
			out.writeObject(dog2);
			out.writeObject(cat1);
			out.writeObject(cat2);

			System.out.println("物件已序列化並寫入到 " + filePath);

		} catch (IOException e) {
			System.out.println("序列化過程中發生錯誤。");
			e.printStackTrace();
		}
	}
}
