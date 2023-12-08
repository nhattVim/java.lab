package fa.training.abstraction;

import java.util.Scanner;

/**
*   author: nhattruongNeoVim
*   since: 31/10/2023 10:40
*   description: 
*   update:
*           - nhattruongNeoVim(31/10/2023 10:44)
*
*/

public abstract class Employee {
    private String employeeName;
    private String dateOfBirth;
    private String address;
    private static String companyName;

    public String getCompanyName(){
        return companyName;
    }

    public static void setCompanyName(String companyName){
        Employee.companyName = companyName;
    }

    protected void inputData(Scanner scanner){
        System.out.println("Enter name: ");
        employeeName = scanner.nextLine();

        System.out.println("Enter birth date: ");
        dateOfBirth = scanner.nextLine();

        System.out.println("Enter address: ");
        address = scanner.nextLine();
    }
    protected void display(){
        System.out.print(employeeName + "\t" + dateOfBirth + "\t" + address + "\t" + companyName);
    }

//    getter/setter methods
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public abstract double calSalary();
}
