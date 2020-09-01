package com.github.sokaorochi.BeingAndroid.c7Rc.ex;

class Cleaner {
    private String s = "NDC of Cleaner";

    Cleaner() {
        System.out.println(s);
    }

    void append(String a) {
        s += a;
    }

    void dilute(int times) {
        for (int i = 0; i < times; i++) {
            append(" dilute() ");
        }
        System.out.println(s);
    }

    void apply(int times) {
        for (int i = 0; i < times; i++) {
            append(" apply() ");
        }
        System.out.println(s);
    }

    void scrub(int times) {
        for (int i = 0; i < times; i++) {
            append(" srub() ");
        }
        System.out.println(s);
    }
}

public class e11 {
    private String name;
    private Cleaner cr = new Cleaner();
    public e11(String name) {
        this.name = name;
    }
    public String toString() {
        return this.name;
    }

    void dilute(int times) {
        cr.dilute(times);
    }
    void apply(int times) {
        cr.apply(times);
    }
    void scrub(int times) {
        cr.scrub(times);
    }

    public static void main(String[] args) {
        e11 demo = new e11("hihi");
        demo.dilute(3);
        System.out.println(demo);
    }    
}