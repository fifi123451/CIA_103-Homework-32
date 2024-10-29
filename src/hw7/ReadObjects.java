package hw7;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjects {

    public static void main(String[] args) {
        String filePath = "C:\\data\\Object.ser";

        // 反序列化物件並執行 speak() 方法
        try (FileInputStream fileIn = new FileInputStream(filePath);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {

     