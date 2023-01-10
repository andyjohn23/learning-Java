package gross_calculator;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args){
//        Get the number of hours worked
        int hours = 0;
        System.out.print("How many hours did you work? ");
        Scanner scanner = new Scanner(System.in);
        hours = scanner.nextInt();
//          Get the hourly pay rate
        double payRate = 0;
        System.out.println("What is your pay rate?");
        payRate = scanner.nextDouble();

        scanner.close();
//            Multiply hours and pay rate
        double grossPay = hours * payRate;
//              Display results
        System.out.println("Your gross pay is: " + grossPay);
    }
}
