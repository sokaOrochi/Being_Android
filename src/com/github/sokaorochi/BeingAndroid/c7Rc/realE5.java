package com.github.sokaorochi.BeingAndroid.c7Rc;

class A {
    A() {
        System.out.println("DC of A");
    }
}

class B {
    B() {
        System.out.println("DC of B");
    }
}

class C extends A {
    B newB = new B();
}

public class realE5 {
    public static void main(String[] args) {
       C newC = new C();
    }    
}