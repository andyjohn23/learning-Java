package add_numbers;

/*
DO WHILE loop.
Write a program that allows user to enter two numbers,
and then sums up the two numbers. The user should be able to repeat
this action until they indicate they are done.
*/

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int defaultValue = 0;
        do{
            System.out.println("Enter the first number");
            double getNUmber1 = scanner.nextDouble();

            System.out.println("Enter the second number");
            double getNUmber2 = scanner.nextDouble();

            double totalSum = getNUmber1 + getNUmber2;
            System.out.println("Your answer is: " + totalSum + ".");
            System.out.println("Would you like to continue?\nPress 1 for yes or 2 for no");
            defaultValue = scanner.nextInt();
        }while(defaultValue == 1);
        scanner.close();

    }
}
