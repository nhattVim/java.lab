package fa.training.assignment1.car;

/**
 * Ford
 */
public class Ford extends Car{

    private int year;
    private int manufacturerDiscount;

    public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    public int getYear() {
        return year;
    }

    public int getManufacturerDiscount() {
        return manufacturerDiscount;
    }

    @Override
    public double getSalePrice() {
        return regularPrice * manufacturerDiscount / 100;
    }
}
