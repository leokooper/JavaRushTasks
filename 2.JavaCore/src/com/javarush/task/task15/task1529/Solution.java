package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        reset();
    }

    public static Flyable result;

    public static void reset() {
        //add your code here - добавьте код тут
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        String sp = null;
        try {
            s = br.readLine();
            if(s.equals("helicopter")) {result = new Helicopter();}
            if(s.equals("plane")) {
                sp = br.readLine();
                Integer i = Integer.parseInt(sp);
                result = new Plane(i);
            }
                br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
