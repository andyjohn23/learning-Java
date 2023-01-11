package change_dollar_game;

import java.util.Scanner;

public class ChangeDollarGame {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
//        set default values first
        double winValue = 1;
        double defaultPennies = 0.01;
        double defaultNickels = 0.05;
        double defaultDime = 0.10;
        double defaultQuarters = 0.25;

//        Get necessary information from user
        System.out.println("WELCOME TO CHANGE DOLLAR GAME, YOUR GOAL TO ENTER ENOUGH CHANGE TO MAKE EXACTLY $1.");
        System.out.println("Enter number of pennies: ");
        double getPennies = scanner.nextDouble();
        System.out.println("Enter number of nickels: ");
        double getNickels = scanner.nextDouble();
        System.out.println("Enter number of dimes:  ");
        double getDimes = scanner.nextDouble();
        System.out.println("Enter number of quarters: ");
        double getQuarters = scanner.nextDouble();
        scanner.close();

//        logic part
//        change rates
        double convertedNickels = getNickels * defaultNickels;
        double convertedDimes = getDimes * defaultDime;
        double convertedQuarters = getQuarters * defaultQuarters;
        double convertedPenny = getPennies * defaultPennies;

        double totalValue = convertedPenny + convertedNickels + convertedDimes + convertedQuarters;

        if(totalValue == winValue){
            System.out.println("Congratulations, YOU'VE WON\nyour total change was $" + totalValue);
        }else if(totalValue > winValue){
            double getGapNumberOver = totalValue - winValue;
            System.out.println("Sorry you've lost, you've exceeded by $" + getGapNumberOver + ".");
        }else {
            double getGapNumberUnder = winValue - totalValue;
            System.out.println("Sorry you've lost, you're short by $" + getGapNumberUnder + ".");
        }

    }
}
