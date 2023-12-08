package fa.training.abstraction;

import java.util.Scanner;

/**
*   author: nhattruongNeoVim
*   since: 31/10/2023 10:41
*   description: 
*   update:
*           - nhattruongNeoVim(31/10/2023 10:41)
*
*/

public class EmployeeManagement {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];

        ProductStaff productStaff = new ProductStaff();
        DailyStaff dailyStaff = new DailyStaff();
        Manager manager = new Manager();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Emploee 1");
        productStaff.inputData(scanner);

        System.out.println("Emploee 2");
        dailyStaff.inputData(scanner);

        System.out.println("Emploee 3");
        manager.inputData(scanner);

        Employee.setCompanyName("QNU");

        employees[0] = productStaff;
        employees[1] = dailyStaff;
        employees[2] = manager;

        for (Employee employee : employees){
            employee.display();
        }
        scanner.close();
    }
}
