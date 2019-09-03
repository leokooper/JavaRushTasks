package com.javarush.task.task15.task1529;

public class Plane implements Flyable{

    @Override
    public void fly() {

    }

    int pasengerCount;

    public Plane(int pasengerCount) {
        this.pasengerCount = pasengerCount;
    }
}
