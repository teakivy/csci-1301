package homework;

import java.util.Scanner;

/**
 * Class: CSCI 1301 Programming Principles I C, Fall 2023
 * Instructor: Md Shakil Hossain
 * Description: Lab 8
 * Due: 27 October 2023
 * I pledge by honor that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 *
 * Sign here: Collin Jones
 */
public class Lab8 {
    private final static int SCORES = 5;

    public static void main(String[] args) {
        // Get the scores
        double[] scores = inputScores(SCORES);

        // Display results
        System.out.println("The number of scores above average is: " + highScoreCount(scores));
    }

    /**
     * Get the scores from the user
     * @param size number of scores to get
     * @return array of scores
     */
    public static double[] inputScores(int size) {
        // Create the array
        double[] scores = new double[size];
        Scanner input = new Scanner(System.in);

        // Starting statement
        System.out.println("Please enter " + size + " scores in the array you want to make: ");

        // Get the scores
        for (int i = 0; i < size; i++) {
            System.out.println("Please enter a score");
            scores[i] = input.nextDouble();
        }

        return scores;
    }

    /**
     * Get the number of scores above average
     * @param scores array of scores
     * @return number of scores above average
     */
    public static int highScoreCount(double[] scores) {
        // Calculate the average score
        double average = 0;
        for (double score : scores) {
            average += score;
        }
        average /= scores.length;

        // Count the number of scores above average
        int count = 0;
        for (double score : scores) {
            if (score > average) count++;
        }

        return count;
    }
}
