package hw5;

public class MyRectangleMain {

	public static void main(String[] args) {
        // 使用無參數建構子，並設定寬度和深度為 10 和 20
        MyRectangle rect1 = new MyRectangle();
        rect1.setWidth(10);
        rect1.setDepth(20);
        System.out.println("Rect1 面積: " + rect1.getArea());  // 應輸出 200.0

        // 使用帶參數建構子，直接設置寬度和深度為 10 和 20
        MyRectangle rect2 = new MyRectangle(10, 20);
        System.out.println("Rect2 面積: " + rect2.getArea());  // 應輸出 200.0
    }
}
