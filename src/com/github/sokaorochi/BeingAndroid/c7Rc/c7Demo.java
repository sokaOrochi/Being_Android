package com.github.sokaorochi.BeingAndroid.c7Rc;

class Water {
    private String s;
    Water() {
        s = "watch";
    }
    public String toString() {
        return s;
    }
}

public class c7Demo {
    private Water source = new Water();
    public String toString() {
        return "source = " + source;
    }
    public static void main(String[] args) {
        c7Demo cd = new c7Demo();
        System.out.println(cd.toString());
    }
}