package week3;

public class Main {

    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(5.0);
        Circle circle3 = new Circle(3.0);

        // Test equals method
        System.out.println("circle1 equals circle2: " + circle1.equals(circle2)); // Should be true
        System.out.println("circle1 equals circle3: " + circle1.equals(circle3)); // Should be false

        // Test compareTo method
        System.out.println("circle1 compared to circle2: " + circle1.compareTo(circle2)); // Should be 0
        System.out.println("circle1 compared to circle3: " + circle1.compareTo(circle3)); // Should be 1
        System.out.println("circle3 compared to circle1: " + circle3.compareTo(circle1)); // Should be -1
    }

}
