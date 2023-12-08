package fa.training.assignment1.car;

/**
 * Car
 */
public abstract class Car {

    protected int speed;
    protected double regularPrice;
    protected String color;
    
    public Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.color = color;
        this.regularPrice = regularPrice;
    }

    public int getSpeed() {
        return speed;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public String getColor() {
        return color;
    }

    public abstract double getSalePrice();
}
