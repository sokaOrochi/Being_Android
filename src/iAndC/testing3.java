package iAndC;

class Fuck {
    int Fucking_number = 123;
    String string = "hihi";

    Fuck() {
        util.p("default constructor");
    }

    Fuck(int num) {
        util.p(num);
    }

    Fuck(int num, String s) {
        this(num);
        // this.string = s;
        // this.string = s;
        this.string = s;
        util.p(this.string);
    }
}

public class testing3 {

    public static void main(final String[] args) {
       // Fuck f = new Fuck(123, "hihihi");
    }
}