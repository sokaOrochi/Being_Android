package iAndC;

class Bowl {
    Bowl(int marker) {
        util.p("Bowl(" + marker + ")");
    }
    void f1(int marker) {
        util.p("f1(" + marker + ")");
    }
   }

class Table {
    static Bowl bowl1 = new Bowl(1);
    Table() {
        util.p("Table()");
        bowl2.f1(1);
    }
    void f2(int marker) {
        util.p("f2(" + marker + ")");
    }
    static Bowl bowl2 = new Bowl(2);
}

class Cupboard {
    Bowl bowl3 = new Bowl(3);
    static Bowl bowl4 = new Bowl(4);
    Cupboard() {
        util.p("Cupboard()");
        bowl4.f1(2);
    }
    void f3(int marker) {
        util.p("f3(" + marker + ")");
    }
    static Bowl bowl5 = new Bowl(5);
}

public class t5 {
    public static void main(String[] args) {
        util.p("Creating new Cupboard() in main");
        new Cupboard();
        util.p("Creating new Cupboard() in main");
        new Cupboard();
        table.f2(1);
        cupboard.f3(1);
    }

    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();
    
}