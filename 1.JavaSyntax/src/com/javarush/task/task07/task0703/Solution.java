package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] smas = new String[10];
        int[] imas = new int[10];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            String s = br.readLine();
            smas[i] = s;
            imas[i] = smas[i].length();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(imas[i]);
        }
    }
}
