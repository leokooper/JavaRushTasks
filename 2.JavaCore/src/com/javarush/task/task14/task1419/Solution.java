package com.javarush.task.task14.task1419;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            File file = new File("E://file.txt");
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            exceptions.add(e);
        }


        try {
            int num[] = {1, 2, 3, 4};
            System.out.println(num[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            exceptions.add(e);
        }

        try {
            Object x[] = new String[3];
            x[0] = new Integer(0);
        } catch (ArrayStoreException e) {
            exceptions.add(e);
        }


        String s = null;
        try {
            Object x = new Integer(0);
            s = (String) x;
        } catch (ClassCastException e) {
            exceptions.add(e);
        }

        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            exceptions.add(e);
        }

        int a = -10;
        int b = -1000;
        try {
            int[] asd = new int[a + b];

        } catch (NegativeArraySizeException e) {
            exceptions.add(e);
        }


        try {
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        } catch (NumberFormatException e) {
            exceptions.add(e);
        }


        try {
            String str = "easysteps2buildwebsite";
            System.out.println(str.length());
            char c = str.charAt(0);
            c = str.charAt(40);
            System.out.println(c);
        } catch (StringIndexOutOfBoundsException e) {
            exceptions.add(e);
        }

        try
        {
            exceptions.get(1000);
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }
        //напишите тут ваш код

    }
}
