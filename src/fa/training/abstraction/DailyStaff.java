package fa.training.abstraction;

import java.util.Scanner;

/**
*   author: nhattruongNeoVim
*   since: 31/10/2023 10:40
*   description:
*   update:
*           - nhattruongNeoVim(31/10/2023 10:40)
*
*/

public class DailyStaff extends Employee{
    private static final int WAGE_DAY = 15;

    private double numberOfWorkDay;

    @Override
    public double calSalary(){
        return WAGE_DAY * numberOfWorkDay;
    }

    @Override
    protected void inputData(Scanner scanner){
        super.inputData(scanner);
        System.out.println("Enter number of work day: ");
        numberOfWorkDay = Double.parseDouble(scanner.nextLine());

        System.out.println("-----------------");
    }

    @Override
    protected void display(){
        super.display();

        System.out.println("\t" + numberOfWorkDay + "\t" + this.calSalary() + "\n");
    }
}
