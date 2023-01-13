package greetings_program;

/*
Methods in Java.
Write a program that defines a method to greet a user by name.
*/

import java.util.Scanner;

public class GreetingsProgram {
    public static void main(String[] args){
//        calling the greet user method for execution
        greetUser();
    }
    public static void greetUser(){
        System.out.println("Please enter your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Good afternoon " + name + ".");
    }
}
