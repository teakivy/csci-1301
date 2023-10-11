package homework;

/**
 * Class: CSCI 1301 Programming Principles I C, Fall 2023
 * Instructor: Md Shakil Hossain
 * Description: Homework 6
 * Due: 15 October 2023
 * I pledge by honor that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 *
 * Sign here: Collin Jones
 */
public class CylinderTest {
    public static void main(String[] args) {
        // Create the cylinders
        Cylinder cyl1 = new Cylinder();
        Cylinder cyl2 = new Cylinder(2.5, 12.3);
        Cylinder cyl3 = new Cylinder();

        // Modify the cylinder
        cyl3.setRadius(5);
        cyl3.setLength(6.5);

        // Print the cylinders
        System.out.println("The radius of the first cylinder is: " + cyl1.getRadius() + " and the length is: " + cyl1.getLength());
        System.out.println("The base area of the second cylinder is: " + cyl2.getArea());
        System.out.println("The volume of the third cylinder is: " + cyl3.getVolume());
        System.out.println("The amount of objects created is: " + Cylinder.getNumberOfObjects());
    }
}
