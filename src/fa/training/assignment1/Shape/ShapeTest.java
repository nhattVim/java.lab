package fa.training.assignment1.Shape;

import java.util.Scanner;

/**
 * ShapeTest
 */
public class ShapeTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rectangles: ");
        int n = scanner.nextInt();

        Rectangle[] rectangles = new Rectangle[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter dimensions for Rectangle " + (i + 1) + ":");
            System.out.print("Length: ");
            int length = scanner.nextInt();

            System.out.print("Width: ");
            int width = scanner.nextInt();

            rectangles[i] = new Rectangle();
            rectangles[i].setLengthAndWidth(length, width);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("\nRectangle " + (i + 1) + " Info:");
            System.out.println("Length: " + rectangles[i].getLength());
            System.out.println("Width: " + rectangles[i].getWidth());
            System.out.println("Perimeter: " + rectangles[i].calculatePerimeter());
            System.out.println("Area: " + rectangles[i].calculateArea());
        }

        Rectangle maxAreaRectangle = rectangles[0];
        for (int i = 1; i < n; i++) {
            if (rectangles[i].calculateArea() > maxAreaRectangle.calculateArea()) {
                maxAreaRectangle = rectangles[i];
            }
        }

        System.out.println("\nRectangle with Maximum Area:");
        System.out.println("Length: " + maxAreaRectangle.getLength());
        System.out.println("Width: " + maxAreaRectangle.getWidth());
        System.out.println("Area: " + maxAreaRectangle.calculateArea());

        // Find rectangle with minimum perimeter
        Rectangle minPerimeterRectangle = rectangles[0];
        for (int i = 1; i < n; i++) {
            if (rectangles[i].calculatePerimeter() < minPerimeterRectangle.calculatePerimeter()) {
                minPerimeterRectangle = rectangles[i];
            }
        }

        System.out.println("\nRectangle with Minimum Perimeter:");
        System.out.println("Length: " + minPerimeterRectangle.getLength());
        System.out.println("Width: " + minPerimeterRectangle.getWidth());
        System.out.println("Perimeter: " + minPerimeterRectangle.calculatePerimeter());

        scanner.close();
    }
}
