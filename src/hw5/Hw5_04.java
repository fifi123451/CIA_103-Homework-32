package hw5;

import java.util.Random;

public class Hw5_04 {

//你可以使用 Java 來設計一個方法 genAuthCode()，
//該方法會生成一個包含大小寫字母和數字的 8 位隨機驗證碼。

	// 定義一個方法來生成驗證碼
	public static String genAuthCode() {
		// 定義驗證碼可能包含的字元：大寫字母、小寫字母、數字
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		StringBuilder authCode = new StringBuilder();
		Random random = new Random();

		// 生成8位數驗證碼
		for (int i = 0; i < 8; i++) {
			int index = random.nextInt(chars.length());
			authCode.append(chars.charAt(index));
		}

		return authCode.toString();
	}

	public static void main(String[] args) {
		// 測試生成驗證碼
		String authCode = genAuthCode();
		System.out.println("生成的驗證碼: " + authCode);
	}
}

//程式說明：
//chars：包含所有可用來生成驗證碼的字元，包括大寫字母、小寫字母和數字。
//StringBuilder：用來儲存隨機生成的驗證碼。
//Random：用來生成隨機數字，用以隨機選取字元。
//genAuthCode()：每次呼叫此方法時，會生成一個隨機的 8 位驗證碼。
//你可以呼叫 genAuthCode() 方法來獲取驗證碼，並印出驗證碼來進行測試。