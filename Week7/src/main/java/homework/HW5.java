package homework;

import brandon.math.Math;

/**
 * Class: CSCI 1301 Programming Principles I C, Fall 2023
 * Instructor: Md Shakil Hossain
 * Description: Homework 5
 * Due: 1 October 2023
 * I pledge by honor that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 *
 * Sign here: Collin Jones
 */
public class HW5 {
    public static void main(String[] args) {
        // Find mean
        double meanValue = mean(99, 1000);

        // Find standard deviation
        double deviationValue = deviation(99, 1000);

        // Display result
        System.out.println("The mean is " + meanValue);
        System.out.println("The standard deviation is " + deviationValue);
    }

    /**
     * Calculate the mean of n random numbers between 0 and boundary
     *
     * @param boundary The upper bound of the random numbers
     * @param n The number of random numbers to generate
     * @return The mean of the random numbers
     */
    public static double mean(int boundary, int n) {
        double sum = 0;

        for (int i = 0; i < n ; i++) {
            sum += (int) (Math.random() * (boundary + 1));
        }

        return sum / n;
    }

    /**
     * Calculate the standard deviation of n random numbers between 0 and boundary
     *
     * @param boundary The upper bound of the random numbers
     * @param n The number of random numbers to generate
     * @return The standard deviation of the random numbers
     */
    public static double deviation(int boundary, int n) {
        // Random number, sum and it's squared form
        int number;
        double sum = 0;
        double squareSum = 0;

        // Create numbers, find its sum, and its square sum
        for (int i = 0; i < n; i++) {
            number = (int) (Math.random() * (boundary + 1));

            sum += number;

            squareSum += Math.pow(number, 2);
        }

        // Standard deviation formula
        return Math.sqrt((squareSum - ((sum * sum) / n)) / (n - 1));
    }
}
