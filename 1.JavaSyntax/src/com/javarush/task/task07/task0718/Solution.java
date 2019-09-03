package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> al = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = br.readLine();
            al.add(s);
        }

        for (int i = 1; i < al.size(); i++) {
            if (al.get(i).length() < al.get(i - 1).length()) {
                System.out.println(i);
                break;
            }


        }
    }
}

