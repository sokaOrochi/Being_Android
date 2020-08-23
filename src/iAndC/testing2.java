package iAndC;

class Tree {
    int input;
    int defaultValue;

    Tree() {
        util.p("Rock");
    }

    Tree(int outsideInput) {
        input = outsideInput;
        var stringInput = String.valueOf(input);
        util.p("Your input is: " + stringInput);
    }

    void info() {
        util.p("info1");
    }

    void info(String s) {
        util.p("info: " + s);
    }
}

public class testing2 {
    static void f(int i) {
        util.p(i);
    }

    static void f(String s) {
        util.p(s);
    }
    public static void main(String[] args) {
        // Tree tree = new Tree(123);
        Tree tree = new Tree();
        tree.info();
        tree.info("hihi");

        f(12);
        f("hihi");
    }
}