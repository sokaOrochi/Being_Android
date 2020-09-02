package com.github.sokaorochi.BeingAndroid.c7Rc.ex;

class ObjectiveItem {
    private String objName;
    ObjectiveItem(String name) {
        this.objName = name;
    }
    public String toString() {
        return this.objName;
    }
}

public class E19 {
    private final ObjectiveItem oi;
    E19() {
        oi = new ObjectiveItem("Chris");
        System.out.println(oi);
    }

    public static void main(String[] args) {
        new E19();
    }
}