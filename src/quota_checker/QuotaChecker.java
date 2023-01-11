package quota_checker;

import java.util.Scanner;

/*
If-Else statement
All salespeople are expected to make at least 10 sales each week.
For those who do, they receive a congratulatory message.
For those who don't, they are informed of how many sales they were short.
*/
public class QuotaChecker {
    public static void main(String[] args){

//        Initialize known values
        int quota = 10;

//          Get values for the unknown
        System.out.println("How many sales did you make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

//        Quick detour for the bonus earners
        if(sales >= quota){
            System.out.println("Congratulations, You have met your quota!!!");
        }else {
            int salesShort = quota - sales;
            System.out.println("Sorry, you did not make your quota, you were " + salesShort + " sales short.");
        }

    }
}
