package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {

        Human h1 = new Human("Ivan", true, 18);
        Human h2 = new Human("Ivana", true, 18);
        Human h3 = new Human("Ivan", true, 18);
        Human h4 = new Human("Ivana", true, 18);
        Human h11 = new Human("Ivana", true, 18, h1, h2);
        Human h12 = new Human("Ivana", true, 18, h1, h2);
        Human h13 = new Human("Ivana", true, 18, h1, h2);
        Human h14 = new Human("Ivana", true, 18, h1, h2);
        Human h15 = new Human("Ivana", true, 18, h1, h2);

        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
        System.out.println(h4);
        System.out.println(h11);
        System.out.println(h12);
        System.out.println(h13);
        System.out.println(h14);
        System.out.println(h15);


    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















