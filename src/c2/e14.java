package c2;

public class e14 {
    static void f(boolean b) {
        if (b == true)
            util.p(true);
        else
            util.p(false);
    }
    static void stringTest(String s, String t) {
        f(s == t);
    }
    public static void main(String[] args) {
       String s = "a", t = "a";
       stringTest(s, t);
    }    
}