package c2;

import java.util.Random;

public class e7 {
    public static void main(String[] args) {

        util.p("Flipping Coin...");
        Random rand = new Random();
        int result = rand.nextInt(2);

        if(result == 1) util.p("Head");
        if(result == 0) util.p("Tail");
    }
}