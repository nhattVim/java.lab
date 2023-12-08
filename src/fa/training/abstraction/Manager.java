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

public class Manager extends Employee{
    private double wage;
    private double basicSalary;

    @Override
    public double calSalary(){
        return wage * basicSalary;
    }

    @Override
    protected void inputData(Scanner scanner){
        super.inputData(scanner);

        System.out.println("Enter wage: ");
        wage = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter basic salary: ");
        basicSalary = Double.parseDouble(scanner.nextLine());

        System.out.println("-------------------");
    }

    @Override
    protected void display(){
        super.display();

        System.out.println("\t" + wage + "\t" + basicSalary + "\t" + this.calSalary() + "\n");
    }
}
