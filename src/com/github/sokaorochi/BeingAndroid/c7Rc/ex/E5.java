package com.github.sokaorochi.BeingAndroid.c7Rc.ex;

class Demo321 {
    public String s321 = "hihi";
    public Demo321() {
        System.out.println("Default constructor of Demo321");
    }
    public void d321() {
        System.out.println("d321 method");
    }
}

class Demo654 extends Demo321 {
    public Integer n654 = 654;
    public String s3210 = "hihihi";
    public Demo654() {
        System.out.println("Dc of Demo654");
    }
    public void d654() {
        System.out.println("d654 method");
    }
}

public class E5 {
    public static void main(String[] args) {
        Demo654 d654 = new Demo654();
        d654.d321();
        d654.d654();
        System.out.println(d654.s321);
    }    
}