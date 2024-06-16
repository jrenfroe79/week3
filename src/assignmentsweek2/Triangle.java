package assignmentsweek2;

public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    /** No-arg constructor that creates a default triangle */
    public Triangle() {
        this(1.0, 1.0, 1.0);
    }

    /** Constructor that creates a triangle with the specified sides */
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    /** Accessor methods for all three data fields */
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    /** Method to calculate and return the area of the triangle */
    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    /** Method to calculate and return the perimeter of the triangle */
    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    /** Method that returns a string description for the triangle */
    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }
}

