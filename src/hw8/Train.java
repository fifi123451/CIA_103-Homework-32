package hw8;

import java.util.ArrayList;
import java.util.HashSet;


public class Train {
	
	    // 屬性
	    int number;          // 班次
	    private String type;         // 車種
	    private String start;        // 出發地
	    private String dest;         // 目的地
	    private double price;        // 票價

	    // 建構子
	    public Train(int number, String type, String start, String dest, double price) {
	        this.number = number;
	        this.type = type;
	        this.start = start;
	        this.dest = dest;
	        this.price = price;
	    }

	    // 取得班次
	    public int getNumber() {
	        return number;
	    }

	    // 取得車種
	    public String getType() {
	        return type;
	    }

	    // 取得出發地
	    public String getStart() {
	        return start;
	    }

	    // 取得目的地
	    public String getDest() {
	        return dest;
	    }

	    // 取得票價
	    public double getPrice() {
	        return price;
	    }

	    // 字串表示
	    @Override
	    public String toString() {
	        return "Train{" +
	                "number=" + number +
	                ", type='" + type + '\'' +
	                ", start='" + start + '\'' +
	                ", dest='" + dest + '\'' +
	                ", price=" + price +
	                '}';
	    }
	

public static void main(String[] args) {
    // 使用 ArrayList 儲存 Train 物件
    ArrayList<Train> trainList = new ArrayList<>();
    trainList.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
    trainList.add(new Train(1254, "區間", "屏東", "基隆", 700));
    trainList.add(new Train(118, "自強", "高雄", "台北", 500));
    trainList.add(new Train(1288, "區間", "新竹", "基隆", 400));
    trainList.add(new Train(122, "自強", "台中", "花蓮", 600));
    trainList.add(new Train(1222, "區間", "樹林", "七堵", 300));
    trainList.add(new Train(1254, "區間", "屏東", "基隆", 700)); // 重複的班次

    // 使用 HashSet 儲存不重複的 Train 物件
    HashSet<Train> trainSet = new HashSet<>(trainList); // 自動去重

    // 只印出不重複的列車資訊
    System.out.println("不重複的列車資訊：");
    for (Train train : trainSet) {
        System.out.println(train);
    }
}
}


//屬性：類別中包含五個屬性：
//班次 (number)、車種 (type)、出發地 (start)、目的地 (dest) 和票價 (price)。
//
//建構子：提供一個建構子以初始化這些屬性。
//
//取得和設置方法：每個屬性都有對應的取得和設置方法，方便外部訪問和修改。
//toString 方法：用來返回物件的字串表示，便於輸出。