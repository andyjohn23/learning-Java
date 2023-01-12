package cashier_program;

/*
For loop.
Write a cashier program that will scan a given number of items,
and tally the cost.
*/

import java.util.Scanner;

public class CashierProgram {
    public static void main(String[] args){
//        Getting the total items to scan
        System.out.println("Please enter the total number of items to be scanned: ");
        Scanner scanner = new Scanner(System.in);
        int itemQuantity = scanner.nextInt();

//         initialize default value
        double totalPrice = 0;

//        create a for loop to calculate the costs of the items all together
        for(int a=0; a < itemQuantity; a++){
            System.out.println("Enter the price of the item: ");
            double itemPrice = scanner.nextDouble();
            totalPrice = totalPrice + itemPrice;
        }

        scanner.close();
        System.out.println("Your total cost is: $" + totalPrice + ".");
    }
}
