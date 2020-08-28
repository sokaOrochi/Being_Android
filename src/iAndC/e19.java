package iAndC;

public class e19 {
    static void f(String... args) {
        for (String s : args) {
            util.p(s);
        }
    }
    public static void main(String[] args) {
        f("1", "2");
        f(new String[] {"123", "adg"});
    }    
}