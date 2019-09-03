package com.javarush.task.task08.task0827;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));

    }

    public static boolean isDateOdd(String date){
        Date curDate = new Date(date);
        Date zeroDate = new Date(date);
        zeroDate.setMonth(0);
        zeroDate.setDate(0);
        return ((curDate.getTime() - zeroDate.getTime()) / 86400000) %2 != 0;
    }
}
