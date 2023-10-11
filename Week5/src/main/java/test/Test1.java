package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Class: CSCI1301-C Introduction to Programming Principles
 * Instructor: Md Shakil Hossain
 * Description: Test 1 Programming Section
 * Due: 15 September 2023
 * I pledge by honor that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 *
 * Sign here: Collin Jones
 */
public class Test1 {

    public static void main(String[] args) {
        /* List of fruits
         * Min price is (index * 10) + 1
         * Max price is (index + 1) * 10
         */
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Pineapple");
        fruits.add("Strawberry");
        fruits.add("Watermelon");

        // Get user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of money you have (in dollars) between 11 and " + (fruits.size() + 1) * 10 + ": ");
        int money = input.nextInt();

        // Get the fruit
        for (int i = 1; i < fruits.size() + 1; i++) {
            String fruit = fruits.get(i - 1);
            int maxPrice = (i + 1) * 10;
            int minPrice = (i * 10) + 1;

            if (money < minPrice || money > maxPrice) continue;
            System.out.println(fruit);
            return;
        }

        // If no fruit was found
        System.out.println("Invalid Input");

    }
}