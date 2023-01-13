package letter_search_program;

import java.util.Scanner;

/*
Break Statement.
Write a program that searches for a string to determine,
if it contains the letter A.
*/
public class LetterSearch {
    public static void main(String[] args){
//        Get text
        System.out.println("Please enter some text: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();

        boolean foundLetter = false;

//        searching text for letter A
        for(int i=0; i<text.length(); i++){
            char currentLetter = text.charAt(i);
            if(currentLetter == 'A' || currentLetter == 'a'){
                foundLetter = true;
                break;
            }
        }

        System.out.println("Found letter A?: " + foundLetter);
    }
}
