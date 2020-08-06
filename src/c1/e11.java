package c1;

class AllTheColorOfTheRainbow {
    int anIntegerRepresentingColors = 10;
    Integer colorsNumber = anIntegerRepresentingColors;
    void changeTheHueOfTheColor(int newHue) {
        System.out.println(colorsNumber);
    }
}

public class e11 {
    public static void main(String[] args) {
        AllTheColorOfTheRainbow testing = new AllTheColorOfTheRainbow();
        testing.changeTheHueOfTheColor(2);
    }
}