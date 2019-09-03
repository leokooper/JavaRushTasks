package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> al = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        al.add("мама");
        al.add("именно");
        al.add("мыла");
        al.add("именно");
        al.add("раму");
        al.add("именно");

        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
    }
}
