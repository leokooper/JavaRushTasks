package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> al = new ArrayList<>();

        for (;;) {
            String s = reader.readLine();
            al.add(s);
            if(s.equals("end")) {
            al.remove(al.size() - 1);
            break;
            }
        }

        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
    }
}