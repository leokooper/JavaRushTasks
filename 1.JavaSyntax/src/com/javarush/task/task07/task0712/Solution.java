package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> al = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        for (int i = 0; i < 10; i++) {
            al.add(br.readLine());
        }

        int minLength = al.get(0).length();
        int maxLength = al.get(0).length();


        for (int i = 1; i < al.size(); i++) {
            if (minLength < al.get(i).length()) {
                minLength = al.get(i).length();
            }
        }

        for (int i = 1; i < al.size(); i++) {
            if (maxLength > al.get(i).length()) {
                maxLength = al.get(i).length();
            }
        }

        for (int i = 0; i < al.size(); i++) {
            if (al.get(i).length() == minLength) {
                System.out.println(al.get(i));
                break;
            } else if (al.get(i).length() == maxLength) {
                System.out.println(al.get(i));
                break;
            }

        }
    }
}