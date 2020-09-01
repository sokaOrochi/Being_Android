package com.github.sokaorochi.BeingAndroid.c7Rc.ex;

class Engine {
    public void service() {
        System.out.println("Your service.");
    }
}

public class Car {
    public Engine engine = new Engine();
    public static void main(String[] args) {
        Car car = new Car();
        car.engine.service();
    }
}