package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] imas = new int[10];
        for (int i = 0; i < 10; i++) {
            imas[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(imas[9 - i]);
        }
    }
}

