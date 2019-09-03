package com.javarush.task.task08.task0802;

/* 
HashMap из 10 пар
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> hm = new HashMap<String, String>();

        hm.put("арбуз","ягода");
        hm.put("банан","трава");
        hm.put("вишня","ягода");
        hm.put("груша","фрукт");
        hm.put("дыня","овощ");
        hm.put("ежевика","куст");
        hm.put("жень-шень","корень");
        hm.put("земляника","ягода");
        hm.put("ирис","цветок");
        hm.put("картофель","клубень");

        for(Map.Entry<String, String> vegsPair : hm.entrySet()) {
            String key = vegsPair.getKey();
            String value = vegsPair.getValue();
            System.out.println(key + " - " + value);
        }
    }
}
