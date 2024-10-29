package hw5;

public class MyRectangle {
    
    // 定義兩個屬性：width 和 depth
    private double width;
    private double depth;

    // (1) 無參數建構子：初始化屬性為 0
    public MyRectangle() {
        this.width = 0;
        this.depth = 0;
    }

    // (2) 帶參數建構子：根據傳入的寬度與深度初始化屬性
    public MyRectangle(double width, double depth) {
        this.width = width;
        this.depth = depth;
    }

    // (3) 設置寬度的方法
    public void setWidth(double width) {
        this.width = width;
    }

    // (4) 設置深度的方法
    public void setDepth(double depth) {
        this.depth = depth;
    }

    // (5) 計算並返回矩形面積的方法
    public double getArea() {
        return this.width * this.depth;
    }
}
