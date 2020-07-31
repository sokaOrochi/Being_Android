import org.junit.Test;

public class App {

    public static void main(final String args[]) {
        System.out.println("Testing");
    }

    @Test
    public void tseting() {
        final String obj1 = "obj1";
        final String obj2 = "obj1";
        System.out.println( obj1.compareTo(obj2));
    }
}