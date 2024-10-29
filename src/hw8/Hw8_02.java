package hw8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//請寫一隻程式，讓Train物件印出時，能以班次編號由大到小印出
public class Hw8_02 {
    private int number;
    private String type;
    private String start;
    private String dest;
    private double price;

    public Hw8_02(int number, String type, String start, String dest, double price) {
        this.number = number;
        this.type = type;
        this.start = start;
        this.dest = dest;
        this.price = price;
    }

    // Getter 和 Setter 方法
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

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
        // 建立 Train 物件的列表
        List<Hw8_02> trains = new ArrayList<>();
        trains.add(new Hw8_02(202, "普悠瑪", "樹林", "花蓮", 400));
        trains.add(new Hw8_02(1254, "區間", "屏東", "基隆", 700));
        trains.add(new Hw8_02(118, "自強", "高雄", "台北", 500));
        trains.add(new Hw8_02(1288, "區間", "新竹", "基隆", 400));
        trains.add(new Hw8_02(122, "自強", "台中", "花蓮", 600));
        trains.add(new Hw8_02(1222, "區間", "樹林", "七堵", 300));
        trains.add(new Hw8_02(1254, "區間", "屏東", "基隆", 700));

        // 排序並移除重複的元素
        Collections.sort(trains, Comparator.comparingInt(Hw8_02::getNumber).reversed());

        // 移除重複的物件
        List<Hw8_02> uniqueTrains = new ArrayList<>();
        for (Hw8_02 train : trains) {
            if (!uniqueTrains.contains(train)) {
                uniqueTrains.add(train);
            }
        }


        // 印出排序後的列車資訊
        System.out.println("以班次編號由大到小的列車資訊：");
        Train[] trainList;
    
        // 印出不重複且按班次編號由大到小排序的列車
        for (Hw8_02 train1 : uniqueTrains) {
            System.out.println(train1);
        }
    }

}

