package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private boolean sex;
        private String name;
        private int age;
        private String race;
        private String nationality;
        private String skinColor;

        public Human(boolean sex, String name, int age, String race, String nationality, String skinColor) {
            this.sex = sex;
            this.name = name;
            this.age = age;
            this.race = race;
            this.nationality = nationality;
            this.skinColor = skinColor;
        }

        public Human(boolean sex) {
            this.sex = sex;
        }


        public Human(int age){
            this.age = age;
        }

        public Human(String race){
            this.race = race;
        }

        public Human(boolean sex, String name) {
            this.sex = sex;
            this.name = name;
        }

        public Human(boolean sex, String name, int age, String race) {
            this.sex = sex;
            this.name = name;
            this.age = age;
            this.race = race;
        }

        public Human(boolean sex, String name, int age) {

            this.sex = sex;
            this.name = name;
            this.age = age;
        }

        public Human(boolean sex, String name, int age, String race, String nationality) {
            this.sex = sex;
            this.name = name;
            this.age = age;
            this.race = race;
            this.nationality = nationality;
        }

        public Human(int age, String race, String nationality) {
            this.age = age;
            this.race = race;
            this.nationality = nationality;
        }

        public Human(int age, String race, String nationality, String skinColor) {
            this.age = age;
            this.race = race;
            this.nationality = nationality;
            this.skinColor = skinColor;
        }
    }
}
