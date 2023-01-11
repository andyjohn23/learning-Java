package grade_message;

import java.util.Scanner;

public class SwitchExpressions {
    public static void main(String[] args){
        System.out.println("Enter your letter grade(in uppercase): ");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message = switch (grade){
            case "A" -> "Excellent job!";
            case "B", "C" -> "Great job!";
            case "D" -> "Put more effort!";
            case "E" -> "Pull up your socks!";
            default -> "Please enter a correct letter grade eg. A";
        };

        System.out.println(message);
    }
}
