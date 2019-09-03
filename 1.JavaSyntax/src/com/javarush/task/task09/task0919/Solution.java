package com.javarush.task.task09.task0919;

/* 
Деление на ноль
*/

public class Solution {

    public static void main(String[] args) {
        try {
            divisionByZero();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void divisionByZero () {
        int a = 1;
        try {int c = a / 0;
        } catch (Exception e) {
            System.out.println("Деление на ноль!");
        }
    }
}
