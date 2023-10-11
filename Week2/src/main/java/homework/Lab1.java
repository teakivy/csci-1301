package homework;

import java.util.Scanner;

/**
 * Class: CSCI 1301 Programming Principles I C, Fall 2023
 * Instructor: Md Shakil Hossain
 * Description: Feet to Meters Conversion
 * Due: 25 August 2023
 * I pledge by honor that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 *
 * Sign here: Collin Jones
 */
public class Lab1 {
    public static void main(String[] args) {
        // Declare variables
        double feet, meters;

        // Get user input
        System.out.print("Please enter the value of feet: ");
        Scanner input = new Scanner(System.in);
        feet = input.nextDouble();

        // Convert feet to meters
        meters = feet * 0.305;

        // Print results
        System.out.println(feet + " ft converted to meters is " + meters + " m");
    }
}
