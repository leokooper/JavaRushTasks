package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        int num = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            strings.add(br.readLine());
        }
        for (int i = 0; i < 5; i++) {
            if (strings.get(i).length() >= num){
                num = strings.get(i).length();
            }
        }

        for (int i = 0; i < 5; i++) {
            if (strings.get(i).length() == num) System.out.println(strings.get(i));
        }


    }
}

