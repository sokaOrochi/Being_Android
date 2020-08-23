package iAndC;

class Dog {
    Dog() {
        util.p("This is a dog.");
    }

    void bark(int i1, String s1) {
        util.p("barking with " + s1 + i1);
    }

    void bark(String s2, int i2) {
        util.p("barking with " + s2 + i2);
    }

}

public class e5 {
    public static void main(String[] args) {
        Dog soka = new Dog();
        soka.bark(1, "hi");
        soka.bark("hi", 1);
    }    
}