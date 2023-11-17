package test;

import java.util.Scanner;

/**
 * Class: CSCI1301-C Introduction to Programming Principles
 * Instructor: Md Shakil Hossain
 * Description: Test 3 Part A
 * Due: 10 November 2023
 * I pledge by honor that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 *
 * Sign here: Collin Jones
 */
public class PartA {
    public static void main(String[] args) {
        // Initialize the list of numbers
        int[] nums = new int[10];
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter 10 integers
        System.out.println("Input 10 integers:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
        }

        // Display the largest number and its occurrence
        int largest = largest(nums);
        System.out.println("Largest number: " + largest);
        System.out.println("Occurrence of " + largest + ": " + count(nums, largest));
    }

    /**
     * Returns the largest number in the list
     *
     * @param list the list of numbers
     */
    public static int largest(int[] list) {
        int largest = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] > largest) {
                largest = list[i];
            }
        }
        return largest;
    }

    /**
     * Returns the number of times a number appears in the list
     *
     * @param list the list of numbers
     * @param num the number in the list
     */
    public static int count(int[] list, int num) {
        int count = 0;
        for (int j : list) {
            if (j == num) {
                count++;
            }
        }
        return count;
    }
}