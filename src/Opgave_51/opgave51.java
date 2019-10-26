package Opgave_51;

import java.util.Scanner;

public class opgave51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = 0;

        while (score != -1) {

            System.out.print("Enter your score: ");
            score = input.nextInt();

            if (score >= 60) {
                System.out.println("You passed the exam");
            }

            else if (score < 60) {
                System.out.println("You don't pass the exam");
            }
        }
        System.out.println("No numbers are entered except 0");
    }
}