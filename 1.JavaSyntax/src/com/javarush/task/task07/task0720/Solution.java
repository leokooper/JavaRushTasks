package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer n = Integer.parseInt(reader.readLine());
        Integer m = Integer.parseInt(reader.readLine());
        ArrayList<String> al = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String s = reader.readLine();
            al.add(s);
        }
        for (int i = 0; i < m; i++) {
            al.add(al.size(), al.get(0));
            al.remove(0);
        }

        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
    }
}
