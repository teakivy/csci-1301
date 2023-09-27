package homework;

import java.util.Scanner;

/**
 * Class: CSCI 1301 Programming Principles I C, Fall 2023
 * Instructor: Md Shakil Hossain
 * Description: Lab 3
 * Due: 8 September 2023
 * I pledge by honor that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 *
 * Sign here: Collin Jones
 */
public class Lab3 {

    public static void main(String[] args) {
        // Get user input
        System.out.print("Please Enter Integer: ");

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        // Calculate if the number is divisible by 5 and/or 6
        boolean byFive = num % 5 == 0;
        boolean bySix = num % 6 == 0;

        // Print results
        if (byFive && bySix)
            System.out.println(num + " is divisible by both 5 and 6.");

        if (byFive && !bySix)
            System.out.println(num + " is divisible by 5 but not 6.");

        if (!byFive && bySix)
            System.out.println(num + " is divisible by 6 but not 5.");

        if (!byFive && !bySix)
            System.out.println(num + " is divisible by neither 5 nor 6.");
    }
}
