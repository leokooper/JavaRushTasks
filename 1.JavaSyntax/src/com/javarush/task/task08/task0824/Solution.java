package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {

        ArrayList<Human> grandparents1 = new ArrayList<>();
        ArrayList<Human> grandparents2 = new ArrayList<>();
        ArrayList<Human> parents1 = new ArrayList<>();
        ArrayList<Human> parents2 = new ArrayList<>();
        ArrayList<Human> children = new ArrayList<>();
        ArrayList<Human> family = new ArrayList<>();

        grandparents1.add(new Human("Ivan", true, 90, parents1));
        grandparents1.add(new Human("Dasha", false, 90, parents1));
        grandparents2.add(new Human("Petr", true, 90, parents2));
        grandparents2.add(new Human("Sasha", false, 90, parents2));
        parents1.add(new Human("Father", true, 50, children));
        parents2.add(new Human("Mother", false, 50, children));
        children.add(new Human("Sasha", false, 15, new ArrayList<Human>()));
        children.add(new Human("Masha", false, 15, new ArrayList<Human>()));
        children.add(new Human("Misha", true, 15, new ArrayList<Human>()));

        family.addAll(grandparents1);
        family.addAll(grandparents2);
        family.addAll(parents1);
        family.addAll(parents2);
        family.addAll(children);

        for (Human human : family
             ) {
            System.out.println(human);
            
        }
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
