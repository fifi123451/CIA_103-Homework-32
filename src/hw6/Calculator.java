package hw6;

public class Calculator {
	
//	請設計三個類別Calculator.java，CalException.java與CalTest.java，
//	在Calculator.java裡有個自訂方法為powerXY(int x, int y)，功能是會計算x的y次方並回傳結果。
//	CalTest.java執行後，使用者可以輸入x與y的值，請加入例外處理機制，讓程式能解決以下狀況：
//	1. x與y同時為0，(產生自訂的CalException例外物件)
//	2. y為負值，而導致x的y次方結果不為整數
//	3. x與y皆正確情況下，會顯示運算後結果


	    // 計算 x 的 y 次方，並進行例外處理
	    public static double powerXY(int x, int y) throws CalException {
	        if (x == 0 && y == 0) {
	            // x 和 y 同時為 0，拋出自訂例外
	            throw new CalException("0的0次方沒有意義!");
	        }
	        
	        if (y < 0) {
	            double result = Math.pow(x, y); // 計算 x 的 y 次方
	            // 如果 y 為負數，且結果不是整數，拋出自訂例外
	            if (result != (int) result) {
	                throw new CalException("次方為負值，回傳結果不為整數");
	            }
	            return result;
	        }
	        
	        // 正常情況下計算 x 的 y 次方
	        return Math.pow(x, y);
	    }
	}

//程式碼說明：
//Calculator.java:
//
//powerXY(int x, int y) 方法用來計算x𝑦 
// ，同時針對特殊情況進行例外處理：
//當𝑥=0且𝑦=0時，拋出自訂例外 CalException
//顯示「0 的 0 次方沒有意義！」。
//
//當𝑦<0且結果不是整數時，拋出例外「次方為負值，結果回傳不為整數！」。
//正常情況下返回計算結果。
//
//CalException.java:
//這是自訂的例外類別，繼承自 Exception，用來顯示錯誤訊息。
//
//CalTest.java:
//這是測試程式，使用 Scanner 來接收使用者輸入，並調用 Calculator.powerXY() 方法。
//捕捉三種可能的例外：
//CalException：自訂的例外（x 和 y 為 0，或 y 為負且結果不為整數）。
//InputMismatchException：如果使用者輸入的值不是整數，會顯示「輸入格式不正確」。
//使用 finally 區塊確保輸入的資源（Scanner）被關閉。

	    

