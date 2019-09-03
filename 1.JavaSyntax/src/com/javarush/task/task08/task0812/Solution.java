package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> ll = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Integer kbn = Integer.parseInt(br.readLine());
            ll.add(kbn);
        }
        int count = 1;
        int max = 1;
        for (int i = 0; i < ll.size() - 1; i++) {

            if (ll.get(i).equals(ll.get(i + 1))) {
                count++;
                if (max < count) max = count;
            } else count = 1;
        }

        System.out.println(max);

    }
}