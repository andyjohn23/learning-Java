package test_results;

import java.util.Scanner;

/*
If-Else-If
Display the letter grade of a student based on their test score
*/

public class TestResults {
    public static void main(String[] args){

//        Get the tests score
        System.out.println("Please enter your test score.");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        scanner.close();

//        Determine the letter grade based on score
        char grade;
        String message;
        String congrats = "Well done!!!";
        String uplift = "Above average";
        String fail = "Pull up your socks!!!";

        if(score < 60){
            grade = 'E';
        }else if(score < 70){
            grade = 'D';
        }else if(score < 80){
            grade = 'C';
        } else if (score < 90) {
            grade = 'B';
        } else {
            grade = 'A';
        }
    
//        Displaying the grade results with a message.
        if(grade == 'E'){
            message = fail;
        }else if(grade == 'D'){
            message = fail;
        }else if(grade == 'C'){
            message = uplift;
        }else if(grade == 'B'){
            message = congrats;
        }else {
            message = congrats;
        }
        
        System.out.println(message + " your grade is " + grade + ".");

    }
}
