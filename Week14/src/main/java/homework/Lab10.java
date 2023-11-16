package homework;

/**
 * Class: CSCI 1301 Programming Principles I C, Fall 2023
 * Instructor: Md Shakil Hossain
 * Description: Lab 10
 * Due: 17 November 2023
 * I pledge by honor that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 *
 * Sign here: Collin Jones
 */
public class Lab10 {
    public static void main(String[] args) {
        System.out.println("You entered " + args.length + " numbers");

        // Sum the numbers
        int sum = 0;
        for (String arg : args) {
            sum += Integer.parseInt(arg);
        }

        System.out.println("The sum of these numbers is " + sum);
    }
}
