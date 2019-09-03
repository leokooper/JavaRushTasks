package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= 20; i++) {
            set.add(i);
        }
        return (HashSet<Integer>) set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        for (Iterator<Integer> i = set.iterator(); i.hasNext();) {
            Integer element = i.next();
            if (element > 10) {
                i.remove();
            }
        }
        return set;
    }

    public static void main(String[] args) {

    }
}
