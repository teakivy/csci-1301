package test;

import java.util.Scanner;

/**
 * Class: CSCI1301-C Introduction to Programming Principles
 * Instructor: Md Shakil Hossain
 * Description: Test 3 Part C
 * Due: 10 November 2023
 * I pledge by honor that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 *
 * Sign here: Collin Jones
 */
public class PartC {
    public static void main(String[] args) {
        // Initialize the list of laptops
        Scanner input = new Scanner(System.in);
        Laptop[] laptops = new Laptop[5];

        // Prompt the user to enter 5 laptops
        for (int i = 0; i < laptops.length; i++) {
            System.out.println("Enter the brand of laptop " + (i + 1) + ":");
            String brand = input.nextLine();
            System.out.println("Enter the price of laptop " + (i + 1) + ":");
            int price = input.nextInt();
            input.nextLine();
            laptops[i] = new Laptop(brand, price);
        }

        // Display the total price of the laptops
        System.out.println("Total price of the " + laptops.length + " laptops: " + totalPrices(laptops));
    }

    /**
     * Returns the total price of the laptops
     *
     * @param laptops The array of laptops
     * @return The total price of the laptops
     */
    public static int totalPrices(Laptop[] laptops) {
        int total = 0;
        for (Laptop laptop : laptops) {
            total += laptop.getPrice();
        }
        return total;
    }
}