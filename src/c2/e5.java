package c2;

class Dog {
    String name;
    String says;
}

public class e5 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        dog1.name = dog2.name = "spot";
        dog1.says = "Ruff!";
        dog2.says = "Wurf!";

        System.out.println(dog1.name + " says " + dog1.says);
        System.out.println(dog2.name + " says " + dog2.says);

        System.out.println(dog1 == dog2); // false
        System.out.println(dog1.equals(dog2)); // false

        System.out.println(dog1.name == dog2.name); // true
        System.out.println(dog1.name.equals(dog2.name)); // true
    }
}