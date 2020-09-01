package com.github.sokaorochi.BeingAndroid.c7Rc.ex;

import c1.e9;

class Component1 {
    Component1() {
        System.out.println("non-default c of C1");
    }
}

class Component2 {
    Component2() {
        System.out.println("non-default c of C2");
    }
}

class Component3 {
    Component3() {
        System.out.println("non-default c of C3");
    }
}

class Root {
    Root() {
        System.out.println("non-default c of Root.");
    }
    
    // Component1 C1 = new Component1();
    // Component2 C2 = new Component2();
    // Component3 C3 = new Component3();
    Component1 C1;
    Component2 C2;
    Component3 C3;
}

public class E9 extends Root {
   public static void main(final String[] args) {
       E9 e9 = new E9();
   } 
}