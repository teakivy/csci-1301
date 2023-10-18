package homework;


import java.util.Scanner;

/**
 * Class: CSCI 1301 Programming Principles I C, Fall 2023
 * Instructor: Md Shakil Hossain
 * Description: Lab 7
 * Due: 20 October 2023
 * I pledge by honor that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 *
 * Sign here: Collin Jones
 */
public class TestCircle {
    public static void main(String[] args) {

        // Create the circles
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5.5, 3.5, 4.2);

        // Print the circles
        printCircle("Circle 1", circle1);
        printCircle("Circle 2", circle2);

        // Print the distance
        System.out.println("Distance from Circle1 to Circle2: " + circle1.distance(circle2));
    }

    /**
     * Print the circle's radius, centerX, and centerY
     * @param circleName name of the circle
     * @param circle circle to print
     */
    private static void printCircle(String circleName, Circle circle) {
        System.out.println(circleName + "'s Radius: " + circle.getRadius());
        System.out.println(circleName + "'s CenterX: " + circle.getCenterX());
        System.out.println(circleName + "'s CenterY: " + circle.getCenterY());
    }
}
