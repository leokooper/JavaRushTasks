package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String file = br.readLine();

        BufferedWriter bw = new BufferedWriter(new FileWriter(file));

        String read = "";
        while (!(read.equals("exit"))) {
            read = br.readLine();
            bw.write(read);
            bw.newLine();
        }

        bw.close();
        br.close();
    }
}
