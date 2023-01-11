package loan_program;

/*
logical operators.
To qualify for a loan, client must make at least Ksh.100,000
and have been working at current job for at least 2 years
*/

import java.util.Scanner;

public class ClientSalary {
    public static void main(String[] args){
//        initialize default values
        double requiredSalary = 100000.00;
        int currentJobPeriodSpent = 2;

//        Get necessary information from user
        System.out.println("WELCOME TO LOAN PROGRAM, WE WILL ASK YOU SOME FEW\nQUESTIONS TO CHECK IF YOU QUALIFY FOR A LOAN!");
        System.out.println("How much money do you make in a month?: ");
        Scanner scanner = new Scanner(System.in);
        double getSalary = scanner.nextDouble();
        System.out.println("How many years have you been working at your current work place?: ");
        int getTotalYearsWorked = scanner.nextInt();
        scanner.close();

        if(getSalary >= requiredSalary && getTotalYearsWorked >= currentJobPeriodSpent){
            System.out.println("Congratulations, you qualify for a loan!");
        }else{
            System.out.println("Sorry, you don't qualify for a loan!!!");
        }

    }

}
