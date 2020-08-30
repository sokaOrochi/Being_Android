package com.github.sokaorochi.BeingAndroid.c5AC;

import com.github.sokaorochi.BeingAndroid.c5AC.ex.packages.*;


public class Chocolatechip extends Cookie {
    public Chocolatechip() {
        System.out.println("Default constructor of CC");
    }
    public void chomp() {
        bite();
    }

    public static void main(String[] args) {
        Chocolatechip cc = new Chocolatechip();
        cc.chomp();        
    }
}