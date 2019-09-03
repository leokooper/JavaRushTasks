package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        Map<String, String> map = new HashMap<>();
        map.put("Surname1", "Name1");
        map.put("Surname2", "Name2");
        map.put("Surname3", "Name3");
        map.put("Surname4", "Name4");
        map.put("Surname5", "Name5");
        map.put("Surname5", "Name5");
        map.put("Surname6", "Name6");
        map.put("Surname7", "Name7");
        map.put("Surname8", "Name8");
        map.put("Surname9", "Name9");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
