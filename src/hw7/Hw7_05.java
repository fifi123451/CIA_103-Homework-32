package hw7;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Hw7_05 {

//	承上題，請寫一個程式，能讀取Object.ser這四個物件，並執行speak()方法觀察結果如何(請利用多
//			型簡化本題的程式設計)	

	public static void main(String[] args) {
		String filePath = "C:\\data\\Object.ser";

//反序列化物件並執行 speak() 方法
		try (FileInputStream fileIn = new FileInputStream(filePath);
				ObjectInputStream in = new ObjectInputStream(fileIn)) {

			// 依次讀取物件
			while (true) {
				Object obj = in.readObject();

				// 檢查是否是 Animal 類型，然後呼叫 speak() 方法
				if (obj instanceof Animal) {
					Animal animal = (Animal) obj;
					animal.speak();
				}
			}

		} catch (EOFException e) {
			System.out.println("Finished");
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("反序列化過程中發生錯誤。");
			e.printStackTrace();
		}
	}
}
