package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {

    String name;
    int age;
    int weight;
    String address;
    String color;

    public void initialize(String name) {
        this.name = name;
        this.age = 18;
        this.weight = 20;
        this.color = "black";
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "black";
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 20;
        this.color = "black";
    }

    public void initialize(int weight, String color) {
        this.age = 18;
        this.weight = weight;
        this.color = color;
    }

    public void initialize(int weight, String color, String address) {
        this.age = 18;
        this.weight = weight;
        this.address = address;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}
