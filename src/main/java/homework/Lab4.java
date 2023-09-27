package homework;


import java.util.Scanner;

/**
 * Class: CSCI 1301 Programming Principles I C, Fall 2023
 * Instructor: Md Shakil Hossain
 * Description: Lab 4
 * Due: 22 September 2023
 * I pledge by honor that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 *
 * Sign here: Collin Jones
 */
public class Lab4 {
    public static void main(String[] args) {
        // Get user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer input (ranging from 2 to 9): ");
        int num = input.nextInt();

        // Validate input
        if (num < 2 || num > 9) {
            System.out.println("Invalid input.");
            System.exit(1);
        }

        // Print the pattern
        for (int i = num; i >= 1; i--) {
            for (int j = i; j <= num; j++) {
                System.out.print(j);
            }
            System.out.println();

        }
    }
}
