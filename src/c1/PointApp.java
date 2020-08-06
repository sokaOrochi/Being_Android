package c1;

public class PointApp {
    
    public static void main(String[] args) {
        Point p1 = new Point(2, 3);
        Point p2 = new Point(5, 7);
        System.out.printf("Distance between %s and %s: %.1f %n",
                            p1, p2, p1.distance(p2));
    }
}