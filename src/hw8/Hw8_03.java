package hw8;  


import java.util.Comparator;
import java.util.TreeSet;

public class Hw8_03 {
	
	//承上，不僅能讓班次編號由大排到小印出，還可以不重複印出Train物件

    // 屬性
    private int number;          // 班次
    private String type;         // 車種
    private String start;        // 出發地
    private String dest;         // 目的地
    private double price;        // 票價

    // 建構子
    public Hw8_03(int number, String type, String start, String dest, double price) {
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
        return "Hw8_03{" +
                "number=" + number +
                ", type='" + type + '\'' +
                ", start='" + start + '\'' +
                ", dest='" + dest + '\'' +
                ", price=" + price +
                '}';
    }

    // 重寫 equals 和 hashCode 方法，以避免重複
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Hw8_03)) return false;
        Hw8_03 train = (Hw8_03) obj;
        return number == train.number && Double.compare(train.price, price) == 0 &&
               type.equals(train.type) && start.equals(train.start) && dest.equals(train.dest);
    }

    @Override
    public int hashCode() {
        int result = Integer.hashCode(number);
        result = 31 * result + type.hashCode();
        result = 31 * result + start.hashCode();
        result = 31 * result + dest.hashCode();
        result = 31 * result + Double.hashCode(price);
        return result;
    }

    public static void main(String[] args) {
        // 使用 TreeSet 並自定義 Comparator 來按照班次編號降序排序，同時自動避免重複
        TreeSet<Hw8_03> trainSet = new TreeSet<>(new Comparator<Hw8_03>() {
            @Override
            public int compare(Hw8_03 t1, Hw8_03 t2) {
                // 如果班次編號相同，則視為相同元素，不加入
                if (t1.getNumber() == t2.getNumber()) {
                    return 0;
                }
                // 降序排序
                return Integer.compare(t2.getNumber(), t1.getNumber());
            }
        });

        // 新增 Hw8_03 物件
        trainSet.add(new Hw8_03(202, "普悠瑪", "樹林", "花蓮", 400));
        trainSet.add(new Hw8_03(1254, "區間", "屏東", "基隆", 700));
        trainSet.add(new Hw8_03(118, "自強", "高雄", "台北", 500));
        trainSet.add(new Hw8_03(1288, "區間", "新竹", "基隆", 400));
        trainSet.add(new Hw8_03(122, "自強", "台中", "花蓮", 600));
        trainSet.add(new Hw8_03(1222, "區間", "樹林", "七堵", 300));
        trainSet.add(new Hw8_03(1254, "區間", "屏東", "基隆", 700)); // 重複的班次

        // 印出不重複且已排序的列車資訊
        System.out.println("不重複且按班次編號由大到小的列車資訊：");
        for (Hw8_03 train : trainSet) {
            System.out.println(train);
        }
    }
}
