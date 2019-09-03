package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        ArrayList<Integer> al3 = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            String s = br.readLine();
            Integer integer = Integer.parseInt(s);
            al.add(integer);
        }

        for (int i = 0; i < al.size(); i++) {
            Integer x = al.get(i);
            if (x % 3 == 0 && x % 2 == 0) {
              al1.add(x);
              al2.add(x);
            } else if(x % 3 == 0) {
                al1.add(x);
            } else if (x % 2 == 0) {
                al2.add(x);
            } else  al3.add(x);
        }

        printList(al1);
        printList(al2);
        printList(al3);

    }

    public static void printList(List<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }


}
