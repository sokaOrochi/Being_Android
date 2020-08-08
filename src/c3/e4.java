package c3;

public class e4 {
    public static void main(String[] args) {
        int number = 29;
        int factors = 0;
        for (int i = 1; i < (number + 2)/2; i++) {
            if (number % i == 0) factors++;
        }
        if(factors < 2) util.p(number + " is prime number.");
    }

//     public static void main(String[] args) {
// 		for(int i = 1; i < 1000; i++ ) {
// 			int factors = 0;
// 			for(int j = 1; j < (i + 2)/2; j++ ) {
// 				if((i % j) == 0) factors++; 			
// 			}
// 			if(factors < 2) System.out.println(i + " is prime");
// 		}
// 	}
    
}