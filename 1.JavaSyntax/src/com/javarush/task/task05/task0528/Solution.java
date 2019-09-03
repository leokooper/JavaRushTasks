package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/



public class Solution {
    public static void main(String[] args) {
        Date date = new Date("02", "06", "2018");
        System.out.println(date.day + " " + date.month + " " + date.year);
    }

    public static class Date{
        String day;
        String month;
        String year;

        public Date(String day, String month, String year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }
    }
}
