package com.github.sokaorochi.BeingAndroid.c7Rc.ex;

class BaseClass {
    void BaseMethod(int n) {
        System.out.println(n);
    }
}

// class DirviedClass extends BaseClass {
    // void BaseMethod(String ss, int nn) {
        // System.out.println(ss + String.valueOf(nn));
    // }
// }

public class E13 extends BaseClass {
    @Override
    void BaseMethod(int nn) {
        System.out.println(String.valueOf(nn));
    }
    public static void main(String[] args) {
        E13 DC = new E13();
        DC.BaseMethod(123);
    }    
}