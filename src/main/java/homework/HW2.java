package homework;

import java.util.Scanner;

/**
 * Class: CSCI 1301 Programming Principles I C, Fall 2023
 * Instructor: Md Shakil Hossain
 * Description: Tennis Practice
 * Due: 03 September 2023
 * I pledge by honor that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 *
 * Sign here: Collin Jones
 */
public class HW2 {

    public static void main(String[] args) {
        // Get user input
        Scanner input = new Scanner(System.in);

        System.out.print("How many days are left until the tournament? ");
        int days = input.nextInt();

        System.out.print("How many games have you won recently? ");
        int wins = input.nextInt();

        System.out.print("Is it raining? (true/false) ");
        boolean isRaining = input.nextBoolean();

        System.out.print("What is the temperature outside? ");
        int temperature = input.nextInt();

        // Calculate if the player should practice
        boolean doPractice = shouldPractice(days, wins, isRaining, temperature);

        // Print results
        System.out.println("Should you practice today? " + doPractice);
    }

    /**
     * This method should return true if the player should practice, false otherwise.
     * @param days days until tournament
     * @param wins games won recently
     * @param isRaining is it raining?
     * @param temperature temperature outside
     * @return true if the player should practice, false otherwise
     */
    protected static boolean shouldPractice(int days, int wins, boolean isRaining, int temperature) {
        // Practice conditions
        if (days < 14) return true;
        if (wins < 2) return true;

        // Last condition, if it is not raining & less than 95 degrees, else false
        return !isRaining && temperature < 95;
    }
}
