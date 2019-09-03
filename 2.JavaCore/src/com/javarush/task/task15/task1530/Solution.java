package com.javarush.task.task15.task1530;

/* 
Template pattern
*/

public class Solution {
    public static void main(String[] args) {
        TeaMaker tm = new TeaMaker();
        LatteMaker lm = new LatteMaker();
        tm.pour();
        lm.getRightCup();
        tm.putIngredient();
        tm.getRightCup();
        lm.pour();
        lm.putIngredient();

    }
}
