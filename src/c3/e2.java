package c3;

import java.util.Random;

public class e2 {
    static int randoming() {
        Random rand = new Random();
        int randomNumber = rand.nextInt(10);
        return randomNumber;
    }
    public static void main(String[] args) {
        for (int counter = 0; counter < 25; counter++) {
            int firstNumber = randoming();
            int secondNumber = randoming();
            if (firstNumber < secondNumber) {
                util.p(firstNumber + " < " + secondNumber);
                util.p("---");
            }
            else if (firstNumber > secondNumber) {
                util.p(firstNumber + " > " + secondNumber);
                util.p("---");
            }
            else {
                util.p(firstNumber + " = " + secondNumber);
                util.p("---");
            }
        }
    }
}    