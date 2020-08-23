package iAndC;

class Rock {
    int input;
    int defaultValue;

    Rock() {
        util.p("Rock");
    }

    Rock(int outsideInput) {
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

public class testing {
    public void main(String[] args) {
        util.p("hihi");
    }
}