package fa.training.assignment1.car;

import java.util.Scanner;

/**
 * MyOwnAutoShop
 */
public class MyOwnAutoShop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of car: ");
        int n = sc.nextInt();

        Car[] cars = new Car[n];
        for (int i = 0; i < cars.length; i++) {
            int type;
            do {
                System.out.print("Type of car (1.Truck, 2.Ford, 3.Sedan): ");
                type = sc.nextInt();
            } while (type > 3 || type < 1);

            System.out.print("Speed: ");
            int speed = sc.nextInt();

            System.out.print("Price: ");
            double regularPrice = sc.nextDouble();

            System.out.print("Color: ");
            String color = sc.next();

            switch (type) {
                case 1:
                    System.out.print("Weight: ");
                    int weight = sc.nextInt();
                    cars[i] = new Truck(speed, regularPrice, color, weight);
                    break;
                case 2:
                    System.out.print("Year: ");
                    int year = sc.nextInt();
                    System.out.print("Manufacturer Discount(%): ");
                    int manufacturerDiscount = sc.nextInt();
                    cars[i] = new Ford(speed, regularPrice, color, year, manufacturerDiscount);
                    break;
                case 3:
                    System.out.print("Length: ");
                    int length = sc.nextInt();
                    cars[i] = new Sedan(speed, regularPrice, color, length);
                    break;
            }
        }
        sc.close();
        System.out.println();

        System.out.format("%-5s %-8s %-7s %-15s %-15s\n",
                "STT",
                "Speed",
                "Color",
                "Regular Price",
                "Price after sale"
        );

        int i = 0;
        for (Car car : cars) {
            i++;
            System.out.format("%-6s %-7s %-10s %-15s %-15s\n",
                i, 
                car.getSpeed(),
                car.getColor(),
                car.getRegularPrice(),
                car.getSalePrice()
            );
        }
    }
}

// 3
// 1
// 110
// 560000
// Green
// 200
// 2
// 120
// 760000
// Blue
// 2004
// 10
// 3
// 115
// 600000
// Red
// 22
