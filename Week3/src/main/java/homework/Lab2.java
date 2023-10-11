package homework;

import java.util.Scanner;

/**
 * Class: CSCI 1301 Programming Principles I C, Fall 2023
 * Instructor: Md Shakil Hossain
 * Description: Sorting Integers
 * Due: 01 September 2023
 * I pledge by honor that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 *
 * Sign here: Collin Jones
 */
public class Lab2 {

    public static void main(String[] args) {
        // Get user input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of num1: ");
        int num1 = input.nextInt();

        System.out.print("Enter the value of num2: ");
        int num2 = input.nextInt();

        // Sort the numbers
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        // Print results
        System.out.println("The sorted numbers are " + num1 + ", " + num2);
    }
}
