package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> al = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            String s = br.readLine();
            al.add(s);
        }

        al.remove(2);

        for (int i = al.size() - 1; i >= 0; i--) {
            System.out.println(al.get(i));
        }
    }
}


