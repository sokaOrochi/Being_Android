package c1;

class Demo {
    static int i = 47;
}

class Incre {
    static void increment() {
        Demo.i++;
    }
}

public class e8 {
    public static void main(final String[] args) {
        // System.out.println(StaticTest.i);
        final Demo st1 = new Demo();
        final Demo st2 = new Demo();

        Incre.increment();
        System.out.println(st1.i);
        System.out.println(st2.i);

        Incre.increment();
        System.out.println(st1.i);
        System.out.println(st2.i);
    }
}