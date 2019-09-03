package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Person1", 100);
        map.put("Person2", 200);
        map.put("Person3", 300);
        map.put("Person4", 400);
        map.put("Person5", 500);
        map.put("Person6", 600);
        map.put("Person7", 700);
        map.put("Person8", 800);
        map.put("Person9", 900);
        map.put("Person10", 1000);

        return (HashMap) map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        Iterator <Map.Entry<String, Integer>> entries = map.entrySet().iterator();
        while (entries.hasNext()) // пока все множества пар не закончились
        {
            Map.Entry<String, Integer> entry = entries.next();
            // Map.Entry - тип переменной одного поля K-V
            // создаем переменную - entry
            // и присваиваем ей значение следующего next из всех множеств;

            if (entry.getValue() < 500) // если зп меньше 500 в значении getValue полученного одного поля
            {
                entries.remove(); // то берем все множество, и удаляем поле, на котором сейчас установлен итератор
            }
        }
    }

    public static void main(String[] args) {

    }
}