package iAndC;

import java.util.Arrays;

public class demo3 {
    public static void main(final String[] args) {
        final Integer[] a = new Integer[10];
        // for (int i = 0; i < a.length; i++) {
        //     a[i] = 123;
        // }
        util.p(Arrays.toString(a));

        int[] b;
        b = new int[10];
        for (int i = 0; i < b.length; i++) {
            b[i] = 123;
        }
        util.p(Arrays.toString(b));
    }    
}