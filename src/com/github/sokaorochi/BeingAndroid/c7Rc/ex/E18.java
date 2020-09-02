package com.github.sokaorochi.BeingAndroid.c7Rc.ex;

import java.util.Random;

public class E18 {
    private static Random rand = new Random();

    static final int num1 = rand.nextInt(20);
    final int num2 = rand.nextInt(20);

    public static void main(final String[] args) {
        E18 e18 = new E18();
        System.out.println(e18.num1);
        System.out.println(e18.num2);
    }    
}