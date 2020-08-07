package c2;

import java.util.Random;

public class e4 {
    public static void main(String[] args) {
        Random rand = new Random();

        int i = rand.nextInt(10);
        System.out.println(i);

        float velocity, 
              distance = 10f,
              time = 3f;
        velocity = distance / time;
        System.out.println("Velocity is: " + velocity);
    }
}