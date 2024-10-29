package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionExample {

	public static void main(String[] args) {
		// 建立一個 Collection 物件（使用 ArrayList）
		Collection<Object> collection = new ArrayList<>();

		// 將不同類型的物件加入集合
		collection.add(Integer.valueOf(100)); // Integer 物件
		collection.add(Double.valueOf(3.14)); // Double 物件
		collection.add(Long.valueOf(21L)); // Long 物件
		collection.add(Short.valueOf("100")); // Short 物件
		collection.add(Double.valueOf(5.1)); // Double 物件
		collection.add("Kitty"); // String 物件
		collection.add(Integer.valueOf(100)); // Integer 物件
		collection.add(new Object()); // Object 物件
		collection.add("Snoopy"); // String 物件
		collection.add(new BigInteger("1000")); // BigInteger 物件

		// 使用 Iterator、傳統 for 迴圈與 foreach 印出集合裡的所有元素
		System.out.println("集合中的所有元素：");

		// 使用 Iterator
		System.out.println("使用 Iterator:");
		Iterator<Object> iterator = collection.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// 使用傳統 for 迴圈
		System.out.println("使用傳統 for 迴圈:");
		for (int i = 0; i < ((ArrayList<Object>) collection).size(); i++) {
			System.out.println(((ArrayList<Object>) collection).get(i));
		}

		// 使用 foreach 迴圈
		System.out.println("使用 foreach 迴圈:");
		for (Object obj : collection) {
			System.out.println(obj);
		}

		// 移除不是 Number 類型的物件
		collection.removeIf(item -> !(item instanceof Number));

		// 再次印出集合中的所有元素，檢查是否移除了非 Number 物件
		System.out.println("\n移除非 Number 類型物件後的集合元素：");
		for (Object obj : collection) {
			System.out.println(obj);
		}

	}
}
