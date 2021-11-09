package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("valdemar1@gmail.com", "Vladimir Ivanov");
        for (String key : map.keySet()) {
            String el = map.get(key);
            System.out.println(el + System.lineSeparator() + key);
        }
    }
}
