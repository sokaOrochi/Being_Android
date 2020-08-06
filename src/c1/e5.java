package c1;

public class e5 {
    public static void main(String[] args) {
        class DataOnly {
            int i;
            double d;
            boolean b;
           } 
        DataOnly data = new DataOnly();
        data.i = 10;
        data.d = 2.1;
        data.b = true;
        System.out.println(data.i);
        System.out.println(data.d);
        System.out.println(data.b);
    }
}