package com.javarush.task.task15.task1516;

/* 
Значения по умолчанию
*/


//В классе Solution должно быть объявлено поле intVar типа int.
//        2. В классе Solution должно быть объявлено поле doubleVar типа double.
//        3. В классе Solution должно быть объявлено поле DoubleVar типа Double.
//        4. В классе Solution должно быть объявлено поле booleanVar типа boolean.
//        5. В классе Solution должно быть объявлено поле ObjectVar типа Object.
//        6. В классе Solution должно быть объявлено поле ExceptionVar типа Exception.
//        7. В классе Solution должно быть объявлено поле StringVar типа String.
//        8. Метод main должен выводить значения полей на экран(каждое с новой строки или через пробел) в заданном порядке. Инициализировать переменные не нужно.

public class Solution {

    int intVar;
    double doubleVar;
    Double DoubleVar;
    boolean booleanVar;
    Object ObjectVar;
    Exception ExceptionVar;
    String StringVar;

    public static void main(String[] args) {

        Solution sol = new Solution();

        System.out.println(sol.intVar);
        System.out.println(sol.doubleVar);
        System.out.println(sol.DoubleVar);
        System.out.println(sol.booleanVar);
        System.out.println(sol.ObjectVar);
        System.out.println(sol.ExceptionVar);
        System.out.println(sol.StringVar);
    }
}
