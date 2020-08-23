package iAndC;

import java.util.concurrent.Flow;

class Flower {
    int couter = 0;
    Flower(int nnn) {
        couter = nnn;
        util.p("-----------------");
        util.p("Running Flower(i)" + couter);
    }

    Flower(String sss) {
        util.p("`````````````````");
        util.p(sss);
        util.p("Running Flower(s)");
    }

    Flower(String ss, int numbers) {
        this(numbers); // 因爲只能有一個 constructor，所以 call 不了 Flower(String sss)
        util.p("====================");
        util.p("Running Flower(s, i)");
    }

    Flower() {
        this("hihi", 1111);
        util.p("----------------");
        util.p("Running Flower()");
    }
}

public class e9 {
    public static void main(String[] args) {
        new Flower();
        
    }
}