package iAndC;

class Mother {
    int i = 7;
    Mother() {}
}

public class testing4 {
    public static void main(final String[] args) {
        final var m = new Mother();
        util.p(m.i);
    }    
}