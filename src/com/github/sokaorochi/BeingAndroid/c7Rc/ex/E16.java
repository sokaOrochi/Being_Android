package com.github.sokaorochi.BeingAndroid.c7Rc.ex;

class Amphibian {
    private String name;
    Amphibian(String name) {
        this.name = name;
    }
    public String toString() {
        return "The Amphibian you called is "
            + this.name + ".";
    }
    public void evolution(int generations) {
        for (int i = 0; i < generations; i++) {
            System.out.println("Evoluted " + 
                String.valueOf(i) + " generations.");
        }
    }
    static void show(Amphibian a) {
        a.evolution(10);
    }
    
    void evoFly(String mentor) {
        System.out.println(mentor + " teaches" 
            + this.name + " how to fly.");
    }
}

class Frog extends Amphibian {
    private String frogName;

    Frog(String name) {
        super(name);
        this.frogName = name;
    }

    public String toString() {
        return "The Forg you called is " + this.frogName + ".";
    }

    @Override
    void evoFly(String frogMentor) {
        System.out.println(frogMentor + " teaches " 
            + this.frogName + " how to fly.");
    }
    
}

public class E16 {
    public static void main(String[] args) {
        Frog frog = new Frog("Chris");
        System.out.println(frog);
        Amphibian.show(frog);
        frog.evoFly("David");

        // Amphibian snake = new Amphibian("Devil");
        // System.out.println(snake);
        // Amphibian.show(snake);
    }    
}