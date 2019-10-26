package Opgave_5_22;

import java.io.PrintStream;
import java.util.Scanner;

public class Opgave522 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Loan amount");
        double loanAmount = input.nextDouble();
        System.out.println("Duration in years");
        int years = input.nextInt();
        System.out.println("Annual interest rate: ");
        double annualRate = input.nextDouble();

        double monthlyRate = annualRate/1200;
        double monthlyPayment = loanAmount * monthlyRate / (1-1/ Math.pow(1+monthlyRate,years*12));

        System.out.printf("Your monthly Payment is: %.2f\n", monthlyPayment);

        System.out.printf("The total payment: %.2f\n", (monthlyPayment * 12) * years);


        double balance = loanAmount,principal,interest;
        System.out.println("Payment#   interest   principal  Balance");
        for (int i = 1; i <= years * 12; i++) {
         interest = monthlyRate * balance;
         principal = monthlyPayment - interest;
         balance = balance - principal;
            System.out.printf("%-13d%-13.2f%-13.2f%.2f\n", i, interest,
                    principal, balance);

        }
    }
}