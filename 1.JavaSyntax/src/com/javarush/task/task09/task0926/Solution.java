package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> al = new ArrayList<>();
        al.add(new int[] {1, 2, 3, 4, 5});
        al.add(new int[] {1, 2});
        al.add(new int[] {1, 2, 3, 4});
        al.add(new int[] {1, 2, 3, 4, 5, 6, 7});
        al.add(new int[] {});
        return al;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
