package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer int1 = Integer.parseInt(reader.readLine());
        if (int1 <= 0) throw new Exception();
        Integer int2 = Integer.parseInt(reader.readLine());
        if (int2 <= 0) throw new Exception();
        System.out.println(gcd(int1, int2));
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        int x = a % b;
        return gcd(b, x);
    }
}
