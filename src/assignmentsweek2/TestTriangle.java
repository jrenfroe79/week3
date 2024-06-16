package assignmentsweek2;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the three sides of the triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        System.out.print("Enter the color of the triangle: ");
        String color = input.next();

        System.out.print("Is the triangle filled (true/false)? ");
        boolean filled = input.nextBoolean();

        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(filled);

        System.out.println("Triangle area: " + triangle.getArea());
        System.out.println("Triangle perimeter: " + triangle.getPerimeter());
        System.out.println("Triangle color: " + triangle.getColor());
        System.out.println("Triangle filled: " + triangle.isFilled());

        input.close();
    }
}
