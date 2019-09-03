package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("Name1", "Surname1");
        hm.put("Name2", "Surname1");
        hm.put("Name3", "Surname2");
        hm.put("Name4", "Surname2");
        hm.put("Name5", "Surname3");
        hm.put("Name6", "Surname4");
        hm.put("Name7", "Surname5");
        hm.put("Name8", "Surname6");
        hm.put("Name9", "Surname7");
        hm.put("Name10", "Surname8");
        return hm;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код

        ArrayList<String> names = new ArrayList<String>(map.values());
        ArrayList<String>  needtodelete = new ArrayList<String>();



        for (int i = 0; i < names.size(); i++){
            String s = names.get(i);
            for(int j = i + 1; j < names.size(); j++){
                if(s.equals(names.get(j)))
                    needtodelete.add(s);
            }
        }

        for (int i = 0; i < needtodelete.size(); i++){

            removeItemFromMapByValue(map, needtodelete.get(i));
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> mp = createMap();
        removeTheFirstNameDuplicates(mp);
        System.out.println(mp);
    }
}
