package homework;

/**
 * Class: CSCI 1301 Programming Principles I C, Fall 2023
 * Instructor: Md Shakil Hossain
 * Description: Lab 5
 * Due: 29 September 2023
 * I pledge by honor that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 *
 * Sign here: Collin Jones
 */
public class Lab5 {
    public static void main(String[] args) {
        int a = 4, b = -9, c = 7, d = 10;

        int larger = max(a, b);
        System.out.println("The larger of a and b is " + larger);

        int largestOfThree = max(a, b, c);
        System.out.println("The largest of a, b, and c is " + largestOfThree);

        int largestOfFour = max(a, b, c, d);
        System.out.println("The largest of a, b, c and d is " + largestOfFour);
    }

    /**
     * Returns the larger of two integers
     *
     * @param a Number 1
     * @param b Number 2
     * @return The larger of the two numbers
     */
    public static int max(int a, int b) {
        // Use ternary operator to return the larger of the two numbers
        return a > b ? a : b;
    }

    /**
     * Returns the largest of three integers
     *
     * @param a Number 1
     * @param b Number 2
     * @param c Number 3
     * @return The largest of the three numbers
     */
    public static int max(int a, int b, int c) {
        // Call a nested max method with two parameters
        return max(max(a, b), c);
    }

    /**
     * Returns the largest of four integers
     *
     * @param a Number 1
     * @param b Number 2
     * @param c Number 3
     * @param d Number 4
     * @return The largest of the four numbers
     */
    public static int max(int a, int b, int c, int d) {
        // Call a nested max method with three parameters
        return max(max(a, b, c), d);
    }
}