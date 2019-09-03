package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String abc = "абвгдеёжзиклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        ArrayList<String> al = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            al.add(s);
        }

        for(Character character : alphabet) {
            int count = 0;
            for(String s : al){
                for (int i = 0; i < s.length(); i++) {
                    if(s.charAt(i) == character){
                        count++;
                    }
                }
            }
            System.out.println(character + " " + count);
        }

    }
}