package grade_message;

/*
Switch statement
Have a user enter their letter grade, and using a switch statement
print out a message letting them know how they did
*/

import java.util.Scanner;

public class GradeClass {
    public static void main(String[] args){
        System.out.println("Enter your letter grade(in uppercase): ");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message;
        switch (grade){
            case "A":
                message = "Excellent job!";
                break;
            case "B":
                message = "Great job!";
                break;
            case "C":
                message = "Good job!";
                break;
            case "D":
                message = "You need to work a bit harder!!!";
                break;
            case "E":
                message = "Pull up your socks!!!";
                break;
            default:
                message = "PLEASE ENTER A VALID GRADE eg. A";
                break;
        }

        System.out.println(message);

    }
}
