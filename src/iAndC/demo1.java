package iAndC;

class Book {
    boolean checkedOut = false;
    Book(final boolean checkOut) {
        checkedOut = checkOut;
    }

    void checkIn() {
        checkedOut = false;
    }

    protected void finalized() {
        if (checkedOut) {
            util.p("Error: check out");
        }
    }
}

public class demo1 {
    public static void main(final String[] args) {
        final Book novel = new Book(true);
        novel.checkIn();
        new Book(true);
        System.gc();
    }
}