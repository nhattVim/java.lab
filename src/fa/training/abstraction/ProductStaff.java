package fa.training.abstraction;

import java.util.Scanner;

/**
*   author: nhattruongNeoVim
*   since: 31/10/2023 10:41
*   description: 
*   update:
*           - nhattruongNeoVim(31/10/2023 10:44)
*
*/

public class ProductStaff extends Employee{
    private static final int UNIT_PRICE = 20;

    private double amountOfProduct;

    @Override
    public double calSalary(){
        return UNIT_PRICE * amountOfProduct;
    }

    @Override
    protected void inputData(Scanner scanner){
        super.inputData(scanner);
        System.out.println("Enter amount of product: ");
        amountOfProduct = Double.parseDouble(scanner.nextLine());

        System.out.println("-------------------");
    }

    @Override
    protected void display(){
        super.display();

        System.out.println("t" + amountOfProduct + "\t" + this.calSalary() + '\n');
    }
}
