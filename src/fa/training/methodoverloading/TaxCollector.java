package fa.training.methodoverloading;

import java.util.Scanner;

/**
*   author: nhattruongNeoVim
*   since: 31/10/2023 10:57
*   description:
*   update:
*           - nhattruongNeoVim(31/10/2023 10:57)
*
*/

public class TaxCollector {
    public static void main(String[] args) {
//        BasicRateTax taxCalculator = new BasicRateTax();
//        double grossIncome = Double.parseDouble(args[0]);
//        double tax = taxCalculator.calcTax(grossIncome);

        BasicRateTax taxCalculator = new BasicRateTax();
        System.out.print("Enter your income: ");
        double grossIncome = new Scanner(System.in).nextDouble();
        double tax = taxCalculator.calcTax(grossIncome);

        System.out.println(tax);
    }
}
