package instant_credit_check_program;

import java.util.Scanner;

/*
Methods in Java.
Write an instant credit check program that approves anyone,
who makes more than $25000 and has a credit score of 700 or better.
Reject all others.
*/
public class InstantCreditCheck {
    public static void main(String[] args){
//        Get input from user
        System.out.println("Enter your salary: ");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter your credit score: ");
        int creditScore = scanner.nextInt();
        scanner.close();

//        calling the checkCreditQualification method to execute
        checkCreditQualification(salary, creditScore);
    }
    public static void checkCreditQualification( double salary, int creditScore){
        double requiredSalary = 25000;
        int requiredCreditScore = 700;

        if(salary > requiredSalary && creditScore > requiredCreditScore){
            System.out.println("Congratulations, you qualify for a loan.");
        }else{
            System.out.println("Sorry you do not qualify for a loan with us!!!");
        }
    }
}
