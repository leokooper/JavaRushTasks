package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> as = new ArrayList<>();
        as.add("a");
        as.add("b");
        as.add("c");
        as.add("d");
        as.add("e");
        System.out.println(as.size());
        for (int i = 0; i < 5; i++) {
            System.out.println(as.get(i));
        }
    }
}
