package Opgave_05_230;
import java.util.Scanner;

public class Opgave_05_30 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an amount ");
        double amount = input.nextDouble();
        System.out.println("Enter the annual interest rate: ");
        double annualInterestRate = input.nextDouble();
        System.out.println("Enter the number of months: ");
        int months = input.nextInt();

        double monthlyInterestRate = annualInterestRate / 1200;
        double compoundValue = 0;

        for (int m = 1; m <=months; m++) {
            compoundValue = (amount + compoundValue) *(1 + monthlyInterestRate);
        }
        System.out.printf(
                "Amount in savings account after " + months + "months:  $%.2f\n", compoundValue);
    }
}
