package c3;

import java.util.Random;

public class e8 {
    static int createRandNum() {
        Random rand = new Random();
        int randNum = rand.nextInt(10);
        return randNum;
    }

    public static void main(String[] args) {
        // switch(createRandNum()) {
        //     case 1: util.p(1); break;
        //     case 2: util.p(2); break;
        //     case 3: util.p(3); break;
        //     case 4: util.p(4); break;
        //     case 5: util.p(5); break;
        //     case 6: util.p(6); break;
        //     case 7: util.p(7); break;
        //     case 8: util.p(8); break;
        //     case 9: util.p(9); break;
        //     default: util.p(10);
        // }

        for (int i = 0; i < 10; i++) {
            switch(i) {
                case 0: util.p(0); break;
                case 1: util.p(1); break;
                case 2: util.p(2); break;
                case 3: util.p(3); break;
                case 4: util.p(4); break;
                case 5: util.p(5); break;
                case 6: util.p(6); break;
                case 7: util.p(7); break;
                case 8: util.p(8); break;
                case 9: util.p(9); break;
                default: util.p(10);
            }
        }
    }    
}