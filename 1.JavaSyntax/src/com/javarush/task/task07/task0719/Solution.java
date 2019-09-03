package com.javarush.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* 
Вывести числа в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            Integer integer = Integer.parseInt(s);
            al.add(integer);
        }

        Collections.reverse(al);
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }    }
}
