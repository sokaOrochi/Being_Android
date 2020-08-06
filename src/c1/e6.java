package c1;

public class e6 {
    public static void main(String[] args) {
        class Testing {
            int storage(String s) {
                return s.length() * 2;
            }
        }

        Testing demo = new Testing();
        int result = demo.storage("hihi");

        System.out.println(result);
    }
    
}