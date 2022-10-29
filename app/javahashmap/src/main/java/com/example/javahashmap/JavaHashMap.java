package com.example.javahashmap;

import java.util.HashMap;

public class JavaHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> gameStats = new HashMap<>();
        gameStats.put("James", 100);
        gameStats.put("Ruth", 457);
        gameStats.put("Carolina", 679);

//        System.out.println(gameStats.size());
//        gameStats.clear();
//        gameStats.remove("James");
//        for (String item: gameStats.keySet()) {
//            System.out.println(item);
//        }

//        for (int item: gameStats.values()) {
//            System.out.println(item);
//        }

        for (String item: gameStats.keySet()) {
            System.out.println("key: " + item + " value " + gameStats.get(item));
        }





    }
}