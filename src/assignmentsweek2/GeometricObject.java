package assignmentsweek2;

public abstract class GeometricObject {
    private String color = "white";
    private boolean filled;

    /** Default constructor */
    protected GeometricObject() {
    }

    /** Constructor that creates a geometric object with specified color and filled properties */
    protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    /** Getter method for color */
    public String getColor() {
        return color;
    }

    /** Setter method for color */
    public void setColor(String color) {
        this.color = color;
    }

    /** Getter method for filled. Since filled is boolean, the get method name is isFilled */
    public boolean isFilled() {
        return filled;
    }

    /** Setter method for filled */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /** Abstract method to find area */
    public abstract double getArea();

    /** Abstract method to find perimeter */
    public abstract double getPerimeter();
}
