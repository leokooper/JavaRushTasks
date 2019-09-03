package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/


import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();
        InputStream fis = new FileInputStream(fileName);
        Scanner s = new Scanner(fis);

        ArrayList<Integer> al = new ArrayList<>();

        while (s.hasNextInt()) {
            int temp = s.nextInt();
            if (temp % 2 == 0) {
                al.add(temp);
            }
        }
        s.close();
        br.close();
        Collections.sort(al);
        for (Integer arr : al) {
            System.out.println(arr);
        }
    }
}