package com.github.sokaorochi.BeingAndroid.c7Rc.ex;

class DemoC7 {
    String s = "Hold on.";
    // DemoC7() {
    //     System.out.println("Default constructor of DemoC7");
    // }

    // public Object createCons() {
    //     return new DemoC7();
    // }
    public void append(String a) {
        s += a;
    }
    public void mf() {
        append(" motherfucker() ");
    }
    public String toString() {
        return s;
    }
    // public static void main(String[] args) {
    //     DemoC7 DC7 = new DemoC7();
    //     DC7.mf();
    //     System.out.println(DC7);
    // }
}

public class e2 extends DemoC7 {
    public void mf() {
        append(" Democ7.mf()");
        super.mf();
    }
    public void ff() {
        append("fatherfucker");
    }

    public static void main(String[] args) {
        e2 DemoC7E2 = new e2();
        DemoC7E2.mf();
        DemoC7E2.ff();
        System.out.println(DemoC7E2);
        // DemoC7.main(args);
    }
}