package iAndC;

class Apple {
    int tester;

    public void f1() {
        // tester = 10;
        // util.p(this.tester);
        f2();
        this.f2();
    }

    public void f2() {
        util.p("hihi");
    }
}

public class e8 {
    public static void main(String[] args) {
        Apple what = new Apple();
        what.f1();
        // util.p("hi");
    }
    
}