//: operators/e2.java
// Create a class containing a float and use it to demonstrate aliasing. 
package c2;

class Demo {
    float level;
    boolean testing;
}

public class e2 {
    public static void main(final String[] args) {
        Demo d1 = new Demo();
        final Demo d2 = new Demo();

       d1.level = 1;
       d2.level = 2;
       d1.testing = true;
       d2.testing = false;
       System.out.println(d1.level + "  " + d2.level);
       System.out.println(d1.testing + "  " + d2.testing);

       d1.level = d2.level;
       System.out.println(d1.level + "  " + d2.level);
       System.out.println(d1.testing + "  " + d2.testing);

       d1 = d2;
       System.out.println(d1.level + "  " + d2.level);
       System.out.println(d1.testing + "  " + d2.testing);

       // d1.level = 10;
       // System.out.println(d1.level + "  " + d2.level);
    }
} /* Output:
1.0  2.0
true  false
2.0  2.0
true  false
2.0  2.0
false  false
*///:~