package c2;

class Fucking {
    float number;
}

public class e3 {
    static void alias(Fucking x) {
        x.number = 3.1f; // float 後面要加 f
    }

    public static void main(String[] args) {
        Fucking f = new Fucking();
        f.number = 12.3f;
        System.out.println(f.number);
        alias(f);
        System.out.println(f.number);
    }
}