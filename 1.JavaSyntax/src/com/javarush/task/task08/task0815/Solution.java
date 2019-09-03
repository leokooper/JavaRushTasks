package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("Иванов", "Ивана");
        hm.put("Иванова", "Иванаа");
        hm.put("Ивановаа", "Иванааа");
        hm.put("Ивановааа", "Иванаааа");
        hm.put("Ивановаааа", "Иванааааа");
        hm.put("Ивановааааа", "Иванаааааа");
        hm.put("Ивановаааааа", "Иванааааааа");
        hm.put("Ивановааааааа", "Иванаааааааа");
        hm.put("Ивановаааааааа", "Иванааааааааа");
        hm.put("Ивановааааааааа", "Иванаааааааааа");
    return hm;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int count =0;
        for (String s : map.values())
            if (s.equals(name))
                count +=1;
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int count =0;
        for (String s : map.keySet())
            if (s.equals(lastName))
                count +=1;
        return count;
    }

    public static void main(String[] args) {

    }
}
