package gross_pay_input_validator;

import java.util.Scanner;

/*
While loop
Each store employee makes $15 an hour. Write a program that allows
the employee to enter the number of hours worked for the week. DO NOT ALLOW OVERTIME.
*/
public class GrossPayInputValidator {
    public static void main(String[] args){
//        initialize known values
        int payRate = 15;
        int maxHours = 40;

//        Get necessary information from user
        System.out.println("How many hours did the employee work this week?");
        Scanner scanner = new Scanner(System.in);
        double getHoursWorked = scanner.nextDouble();

//          validate user input
        while(getHoursWorked > maxHours){
            System.out.println("Invalid entry. Your hours must be between 1 and 40. Please try again.");
            getHoursWorked = scanner.nextDouble();
        }
        scanner.close();

//        Calculate gross
        double gross = payRate * getHoursWorked;
        System.out.println("Your gross pay is: $" + gross + ".");

    }
}
