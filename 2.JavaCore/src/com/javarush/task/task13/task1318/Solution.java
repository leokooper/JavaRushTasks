package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        InputStream is = new FileInputStream(file);

        while(is.available() > 0) {
            System.out.print((char)is.read());
        }
        is.close();
        reader.close();
    }
}