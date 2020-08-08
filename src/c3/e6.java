package c3;

public class e6 {
    static int test(int testval, int begin, int end) {
        if (testval > begin && testval < end) {
            return 1;
        }
        else
            return 0;
    }
    public static void main(String[] args) {
        util.p(test(2, 1, 6));
        util.p(test(12, 1, 6));
    }    
}