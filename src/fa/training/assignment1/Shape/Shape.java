package fa.training.assignment1.Shape;

/**
 * Shape
 */
public interface Shape {

    public abstract double calculatePerimeter();
    public abstract double calculateArea();
    public abstract double getLength();
    public abstract double getWidth();
    public abstract void setLengthAndWidth(double length, double width);
}
