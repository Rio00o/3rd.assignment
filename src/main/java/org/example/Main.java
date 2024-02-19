package org.example;


import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            Map<String, Integer> fruits = new HashMap<>();
            fruits.put("りんご", 6);
            fruits.put("バナナ", 10);
            fruits.put("オレンジ", 4);
            fruits.put("イチゴ", 9);
            fruits.put("レモン", 1);

            System.out.println("りんごが" + fruits.get("りんご") + "個あります");
            System.out.println("バナナが" + fruits.get("バナナ") + "個あります");
            System.out.println("オレンジが" + fruits.get("オレンジ") + "個あります");
            System.out.println("イチゴが" + fruits.get("イチゴ") + "個あります");
            System.out.println("レモンが" + fruits.get("レモン") + "個あります");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("エラーが発生しました");
        }
   }
}

