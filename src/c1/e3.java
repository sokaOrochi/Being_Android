package c1;

public class e3 {
    public static void main(String[] args) {
        class ATypename {
            int i;
            void show() {
                System.out.println(i);
            }
        }
        ATypename a = new ATypename();
        a.i = 3;
        a.show();
    }    
}