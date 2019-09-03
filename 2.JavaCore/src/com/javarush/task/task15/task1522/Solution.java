package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    static {
        try {
            readKeyFromConsoleAndInitPlanet();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //add static block here - добавьте статический блок тут

    public static void readKeyFromConsoleAndInitPlanet() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        try{
            s = br.readLine();
            br.close();
        } catch (IOException e){
            e.printStackTrace();
        }
        if(s.equals("sun")) {
            thePlanet = Sun.getInstance();
        } else if (s.equals("moon")) {thePlanet = Moon.getInstance();
        } else if (s.equals("earth")) {thePlanet = Earth.getInstance();}
        else thePlanet = null;
        // implement step #5 here - реализуйте задание №5 тут
    }
}
