package com.github.sokaorochi.BeingAndroid.c7Rc;

class Demo1 {
    private final int num;
    private final String s;

    public Demo1() {
        System.out.println("Default constructor of Demo1");
        num = 123;
        s = "hihi";
    }

    public int returnInt() {
        return num;
    }

    public String returnString() {
        return s;
    }
}

class Demo2 {
    Demo1 demo1111 = new Demo1();

    // public String returnInt() {
    //     return "123" + String.valueOf(demo1111);
    // }

    public int returnInt() {
        return 123;
    }

    public String returnString() {
        return "hihi" + demo1111.returnString();
    }
}

public class c7Demo2 {
    public static void main(final String[] args) {
        Demo2 demo2222 = new Demo2();
        System.out.println(demo2222.returnString());
    }    
}