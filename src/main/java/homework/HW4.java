package homework;

import java.util.Scanner;

/**
 * Class: CSCI 1301 Programming Principles I C, Fall 2023
 * Instructor: Md Shakil Hossain
 * Description: Homework 4
 * Due: 24 September 2023
 * I pledge by honor that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 *
 * Sign here: Collin Jones
 */
public class HW4 {
    public static void main(String[] args) {
        // Set up variables
        boolean practicing = true;

        // Run practice loop
        while (practicing) {
            practicing = doPractice();
        }

        // After finished practicing, exit with a goodbye message
        System.out.println("Goodbye.");
    }

    /**
     * Calculates the factorial of a number
     * @param n The number to calculate the factorial of
     * @return The factorial of n
     */
    protected static int factorial(int n) {
        // Base case
        if (n == 0) {
            return 1;
        }

        // Recursive case -> 0
        return n * factorial(n - 1);
    }

    /**
     * Prompts the user to practice their factorials
     * @return Whether or not the user wants to continue practicing
     */
    protected static boolean doPractice() {
        // Get user input
        System.out.print("Would you like to practice your factorials? (Answer 'true' or 'false'): ");
        Scanner input = new Scanner(System.in);
        boolean practicing = input.nextBoolean();

        // If the user doesn't want to practice, exit
        if (!practicing) return false;

        // Otherwise, prompt the user for a number to practice
        System.out.print("Please enter a number to begin practicing: ");
        int num = input.nextInt();
        // Calculate the factorial of the number
        int factorial = factorial(num);

        // Answer loop
        while (true) {
            // Prompt the user for an answer
            System.out.print("What does " + num + "! equal? ");
            int answer = input.nextInt();

            // Check if the answer is correct, if so, exit
            if (answer == factorial) {
                System.out.println("Correct!");
                return true;
            }
            // Otherwise, prompt the user to try again
            System.out.println("Try again!");
        }
    }
}
