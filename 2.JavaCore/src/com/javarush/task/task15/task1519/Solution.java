package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        while (true){
            s = br.readLine();
            if(s.equals("exit")) break;

            try {
                if (s.contains(".")) {
                    double d = Double.parseDouble(s);
                    print(d);
                } else if (Integer.parseInt(s) > 0 && Integer.parseInt(s) < 128) {
                    short c = Short.parseShort(s);
                    print(c);
                } else if (Integer.parseInt(s) <= 0 || Integer.parseInt(s) >= 128) {
                    int i = Integer.parseInt(s);
                    print(i);
                }
            } catch (NumberFormatException e) {
                print(s);
            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
