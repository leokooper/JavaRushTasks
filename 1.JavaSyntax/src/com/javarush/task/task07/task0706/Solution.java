package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] imas = new int[15];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int chet = 0;
        int nechet = 0;

        for (int i = 0; i < 15; i++) {
            imas[i] = Integer.parseInt(br.readLine());

            if (i == 0 || i%2==0) {
                chet += imas[i];
            } else {
                nechet += imas[i];
            }
        }


        if (chet > nechet) System.out.println("В домах с четными номерами проживает больше жителей.");
        else System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
