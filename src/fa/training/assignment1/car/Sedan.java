package fa.training.assignment1.car;

/**
 * Sedan
 */
public class Sedan extends Car{

    private int length;

    public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public double getSalePrice() {
        if (length > 20) {
            return regularPrice * 0.05;
        }
        return regularPrice * 0.1;
    }
}
