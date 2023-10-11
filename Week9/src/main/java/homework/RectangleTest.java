package homework;

/**
 * Class: CSCI 1301 Programming Principles I C, Fall 2023
 * Instructor: Md Shakil Hossain
 * Description: Lab 6
 * Due: 13 October 2023
 * I pledge by honor that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 *
 * Sign here: Collin Jones
 */
public class RectangleTest {
    public static void main(String[] args) {
        // Create the rectangle
        Rectangle rect = new Rectangle(4, 40);
        System.out.println("The width before is " + rect.getWidth());
        System.out.println("The height before is " + rect.getHeight());

        // Modify the rectangle
        rect.setWidth(5);
        rect.setHeight(50);
        System.out.println("The width after is " + rect.getWidth());
        System.out.println("The height after is " + rect.getHeight());

        // Print the area and perimeter
        System.out.println("The area is " + rect.getArea());
        System.out.println("The perimeter is " + rect.getPerimeter());
    }
}
