package com.github.sokaorochi.BeingAndroid.c7Rc.ex;

class A {
    A() {
        System.out.println("A");
    }
}

class B extends A{
    B() {
        System.out.println("B");
        A aa = new A();
    }
    
    B(String b) {
        System.out.println(b);
    }
}

public class E8 {
    public static void main(String[] args) {
       B bb = new B();
    }    
}