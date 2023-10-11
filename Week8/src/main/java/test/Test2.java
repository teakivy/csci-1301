package test;

import java.util.Scanner;

/**
 * Class: CSCI1301-C Introduction to Programming Principles
 * Instructor: Md Shakil Hossain
 * Description: Test 2 Programming Section
 * Due: 6 October 2023
 * I pledge by honor that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 *
 * Sign here: Collin Jones
 */
public class Test2 {
    public static void main(String[] args) {
        // Declare scanner
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Please enter a positive integer: ");
        int num = scanner.nextInt();

        // Input validation
        if (num <= 0) {
            System.out.println("Invalid input. Please try again by inputting a positive integer.");
            return;
        }

        // Calculate and display sum
        int sum = sumOfCubes(num);
        System.out.println("The sum of the cubes from 1^3 up to " + num + "^3 is " + sum + ".");
    }

    /**
     * Returns the sum of the cubes from 1^3 up to num^3.
     * @param num a positive integer
     * @return the sum of the cubes from 1^3 up to num^3
     */
    public static int sumOfCubes(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += (int) Math.pow(i, 3);
        }
        return sum;
    }
}
