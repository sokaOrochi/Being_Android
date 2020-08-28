package iAndC;

import java.util.Random;

public class e16 {
    public static void main(String[] args) {
        Random rand = new Random();
        String[] s = new String[5];
        for (int i = 0; i < s.length; i++) {
            s[i] = String.valueOf(rand.nextInt(10));
        }
        for (String ss : s)
            util.p(ss + " ");
    }
}