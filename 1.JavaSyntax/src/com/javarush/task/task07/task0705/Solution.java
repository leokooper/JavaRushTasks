package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] intm = new int[20];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            intm[i] = Integer.parseInt(br.readLine());
        }
        int[] int1 = new int[10];
        int[] int2 = new int[10];

        for (int i = 0; i < 10; i++) {
            int1[i] = intm[i];
            int2[i] = intm[10+i];
        }


        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.println(int2[i] + " ");
        }
    }
}
