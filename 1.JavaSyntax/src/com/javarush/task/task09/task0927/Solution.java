package com.javarush.task.task09.task0927;

import java.util.*;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> cat = new HashMap<String, Cat>();
        cat.put("Барсик1", new Cat("Барсик1"));
        cat.put("Барсик2", new Cat("Барсик2"));
        cat.put("Барсик3", new Cat("Барсик3"));
        cat.put("Барсик4", new Cat("Барсик4"));
        cat.put("Барсик5", new Cat("Барсик5"));
        cat.put("Барсик6", new Cat("Барсик6"));
        cat.put("Барсик7", new Cat("Барсик7"));
        cat.put("Барсик8", new Cat("Барсик8"));
        cat.put("Барсик9", new Cat("Барсик9"));
        cat.put("Барсик10", new Cat("Барсик10"));
        return cat;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> cat = new HashSet<>();
        for (Map.Entry<String,Cat> pair : map.entrySet()) {
            Cat a = pair.getValue();
            cat.add(a);
        }
        return cat;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
