package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int N = 1;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        if (N > 0) N = Integer.parseInt(reader.readLine());
        int[] a = new int[N];

        int maximum = a[0];

        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < a.length; i++) {
            if(a[i] > maximum)
                maximum = a[i];
        }

        System.out.println(maximum);
    }
}
