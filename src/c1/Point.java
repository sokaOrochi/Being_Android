package c1;

/**
 * Point represents a point in a Cartesian Coordinate System
 * Points are immutable. They cannot be changed once they have been created.
 * 
 * @author soka orochi
 */
public class Point {
    private final int x;
    private final int y;

    /**
     * Constructs and initializes a Point on position (x, y)
     * @param x x coordinate
     * @param y y coordinate
     */
    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    /**
     * Calculates the distance between this point and another
     * point that was passed as a argument
     * @param other point to calculate the distance from
     * @return
     */
    public double distance(Point other) {
        return Math.hypot(x - other.x, y - other.y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}