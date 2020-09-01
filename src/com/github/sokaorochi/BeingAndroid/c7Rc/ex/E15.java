package com.github.sokaorochi.BeingAndroid.c7Rc.ex;

class CarCar {
    private String name;
    public CarCar(String name) {
        this.name = name;
    }
    public String toString() {
        return "The name of this car is:" + name;
    }
    protected void set(String carName) {
        name = carName;
    }
}

class Chris extends CarCar {
    private String owner;
    public Chris(String name, String owner) {
        super(name);
        this.owner = owner;
    }
    public String toString() {
        return super.toString() 
            + " and the owner is: " + owner;
    }
    public void change(String name, String owner) {
        set(name);
        this.owner = owner;
    }
}

public class E15 {
    public static void main(String[] args) {
        Chris chris = new Chris("Car", "Chris");
        System.out.println(chris);
        chris.change("CarCar", "David");
        System.out.println(chris);
    }    
}