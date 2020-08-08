package c1;

import static c1.Demo.i;
import static java.lang.System.out;

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
        // final Demo st1 = new Demo();
        // final Demo st2 = new Demo();

        Incre.increment();
        System.out.println(i);
        System.out.println(i);

        Incre.increment();
        out.println(i);
        System.out.println(Demo.i);
    }
}