package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
            readData();
    }

    public static void readData() {
        ArrayList<Integer> al = new ArrayList<>();
        //напишите тут ваш код
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            while(true){
                al.add(Integer.parseInt(reader.readLine()));}
            } catch (Throwable e) {
            for (int i : al) {
                System.out.println(i);
            }
            }
    }
}
