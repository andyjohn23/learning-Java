package grade_message;

/*
Switch statement
Have a user enter their letter grade, and using a switch statement
print out a message letting them know how they did
*/

import java.util.Scanner;

public class GradeClass {
    public static void main(String[] args){
        System.out.println("Enter your letter grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();


    }
}
