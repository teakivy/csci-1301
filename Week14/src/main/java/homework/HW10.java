package homework;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Class: CSCI 1301 Programming Principles I C, Fall 2023
 * Instructor: Md Shakil Hossain
 * Description: Homework 10
 * Due: 26 November 2023
 * I pledge by honor that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 *
 * Sign here: Collin Jones
 */
public class HW10 {
    public static void main(String[] args) throws IOException {
        // Generate numbers
        int[] randomNumbers = new int[10];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int) (Math.random() * 100);
        }

        // Create first file
        File file1 = createFile1(randomNumbers);
        if (file1 == null) return;

        // Create second file
        createFile2(file1);
    }

    /**
     * Create a file with the given numbers
     * @param nums numbers to write to the file
     * @return the created file
     * @throws IOException if an error occurs while writing to the file
     */
    public static File createFile1(int[] nums) throws IOException {
        return createFile(nums, "hw10.txt");
    }

    /**
     * Create a file with the given numbers multiplied by 10
     * @param file file to read numbers from
     * @return the created file
     * @throws IOException if an error occurs while writing to the file
     */
    public static File createFile2(File file) throws IOException {
        // Get numbers from file and multiply by 10
        int[] nums = new int[10];
        Scanner scanner = new Scanner(file);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt() * 10;
        }

        // Create file
        return createFile(nums, "hw10_scale.txt");
    }

    /**
     * Create a file with the given numbers
     * @param nums numbers to write to the file
     * @param fileName name of the file to create
     * @return the created file
     * @throws IOException if an error occurs while writing to the file
     */
    private static File createFile(int[] nums, String fileName) throws IOException {
        // Get the file and return null if it already exists
        File file = new File(fileName);
        if (file.exists()) return null;

        // Write the numbers to the file
        FileWriter writer = new FileWriter(file);
        for (int num : nums) {
            writer.write(num + "\n");
        }

        // Close the writer and return the file
        writer.close();
        return file;
    }
}
