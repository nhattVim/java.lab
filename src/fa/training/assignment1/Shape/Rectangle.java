package fa.training.assignment1.Shape;

/**
 * Rectangle
 */
public class Rectangle implements Shape{

    private double length;
    private double width;

    @Override
    public double calculatePerimeter() {
        return (width + length) * 2;
    }

    @Override
    public double calculateArea() {
        return width * length;
    }

    @Override
    public double getLength() {
        return length;
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public void setLengthAndWidth(double length, double width) {
        this.length = length;
        this.width = width;
    }
}
