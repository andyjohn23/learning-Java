package students_test_score_program;

/*
Nested loops.
Find the average test score for each student in the class,
there are 24 students and four tests.
*/

import java.util.Scanner;

public class StudentTestScore {
    public static void main(String[] args){
//        initialize known values
        int totalStudents = 24;
        int totalTests = 4;

        Scanner scanner = new Scanner(System.in);

//        process all students
        for(int s=0; s < totalStudents; s++){
            double total = 0;

//            process a student's tests
            for(int t=0; t < totalTests; t++){
                System.out.println("Enter the score for student Number " + (s+1) + " for Test #" + (t+1));
                double getTestScore = scanner.nextDouble();
                total = total + getTestScore;
            }

//            Get average
            double getAverage = total/totalTests;
            System.out.println("The test average for student Number " + (s+1) + " is " + getAverage + ".");

        }
        scanner.close();

    }
}
