package c3;

import java.util.Random;

public class testing {

    public static void main(String[] args) {
        Random rand = new Random();
        float f[] = new float[10];
        for(int i = 0; i < 10; i++)
            f[i] = rand.nextFloat();
        
        for(float x : f)
            // System.out.print(x);
            util.p(x);
        // for (char c : "hihi".toCharArray()) {
        //     util.p(c + " ");
        // }
    }
}