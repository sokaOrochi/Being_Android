package c1;

class StaticTest {
    static int i = 47;
}

class Incrementable {
    static void increment() {
        StaticTest.i++;
    }
}

public class e7 {
    public static void main(String[] args) {
        System.out.println(StaticTest.i);

        Incrementable.increment();

        System.out.println(StaticTest.i);
    }
}