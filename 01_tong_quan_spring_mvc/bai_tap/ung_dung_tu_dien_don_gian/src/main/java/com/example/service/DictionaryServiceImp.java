package com.example.service;

import java.util.HashMap;
import java.util.Map;

public class DictionaryServiceImp {
    static Map<String, String> map = new HashMap<>();
    static {
        map.put("hello","xin chào");
        map.put("hi","chào");
        map.put("bye"," tạm biệt");
    }

    public static String late(String world) {
        for (Map.Entry<String, String> item : map.entrySet()) {
            if (item.getKey().equals(world) ) {
                return item.getValue();
            }
        }
        return "không có";
    }
}