package homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Class: CSCI 1301 Programming Principles I C, Fall 2023
 * Instructor: Md Shakil Hossain
 * Description: Homework 8
 * Due: 29 October 2023
 * I pledge by honor that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 *
 * Sign here: Collin Jones
 */
public class HW8 {
    private static final int ARRAY_SIZE = 8;

    public static void main(String[] args) {
        int[] array1 = inputArray(ARRAY_SIZE);
        int[] array2 = inputArray(ARRAY_SIZE);

        System.out.println("The average of the first array provided is " + average(array1));

        displayArray(add(array1, array2));
    }

    /**
     * Get the array from the user
     * @param size size of the array
     * @return array of integers
     */
    public static int[] inputArray(int size) {
        // Create array
        int[] array = new int [size];
        Scanner input = new Scanner(System.in);

        // Input prompt
        System.out.println("Enter " + size + " integer values to add to the array.");

        // Get the values
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        return array;
    }

    /**
     * Get the average of the array
     * @param list array of integers
     * @return average of the array
     */
    public static double average(int[] list) {
        // Calculate the sum
        double sum = 0;
        for (int num : list) {
            sum += num;
        }

        return sum / list.length;
    }

    /**
     * Add the values of two arrays together
     * @param list1 first array
     * @param list2 second array
     * @return array of the sum of the two arrays
     */
    public static int[] add(int[] list1, int[] list2) {
        // Create array
        int[] array = new int[list1.length];

        // Add the values
        for (int i = 0; i < list1.length; i++) {
            array[i] = list1[i] + list2[i];
        }

        return array;
    }

    /**
     * Display the array sum
     * @param list array of integers
     */
    public static void displayArray(int[] list) {
        System.out.println("The sum resulting array is " + Arrays.toString(list));
    }
}
