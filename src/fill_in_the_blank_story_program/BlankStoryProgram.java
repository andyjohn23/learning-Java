package fill_in_the_blank_story_program;

import java.util.Scanner;

public class BlankStoryProgram {
    public static void main(String[] args){
        String adjective = "";
        System.out.println("Enter any adjective eg. wet");
        Scanner scanner = new Scanner(System.in);
        adjective = scanner.next();

        String season = "";
        System.out.println("Enter any season eg. rainy");
        season = scanner.next();

        int numberOfCups = 0;
        System.out.println("Enter number of cups eg. 5");
        numberOfCups = scanner.nextInt();

        scanner.close();

        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of \n" + numberOfCups + " cups of coffee." );
    }
}
