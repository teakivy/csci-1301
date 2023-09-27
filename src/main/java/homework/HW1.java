package homework;

import java.util.Scanner;

/**
 * Class: CSCI 1301 Programming Principles I C, Fall 2023
 * Instructor: Md Shakil Hossain
 * Description: Computing Base & Volume of a Cylinder
 * Due: 27 August 2023
 * I pledge by honor that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 * <p>
 * Sign here: Collin Jones
 */
public class HW1 {
    // Declare constant
    static final double PI = 3.14159;

    public static void main(String[] args) {
        // Declare variables
        double radius, length, area, volume;

        // Get user input
        Scanner input = new Scanner(System.in);
        System.out.print("Please input a value for radius: ");
        radius = input.nextDouble();
        System.out.print("Please input a value for length: ");
        length = input.nextDouble();

        // Calculate area and volume
        area = radius * radius * PI;
        volume = area * length;

        // Print results
        System.out.println("The area of the cylinder is " + area + " units squared.");
        System.out.println("The volume of the cylinder is " + volume + " units cubed.");
    }
}
