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
public class Cylinder {
    private double radius;
    private double length;
    private static int numberOfObjects = 0;

    /**
     * Default constructor
     * radius = 1
     * length = 1
     */
    public Cylinder() {
        this.radius = 1;
        this.length = 1;

        numberOfObjects++;
    }

    /**
     * Constructor with radius and length
     *
     * @param radius radius of cylinder
     * @param length length of cylinder
     */
    public Cylinder(double radius, double length) {
        this.radius = radius;
        this.length = length;

        numberOfObjects++;
    }

    /**
     * Get the radius of the cylinder
     *
     * @return radius of cylinder
     */
    public double getRadius() {
        return this.radius;
    }

    /**
     * Set the radius of the cylinder
     *
     * @param radius radius of cylinder
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Get the length of the cylinder
     *
     * @return length of cylinder
     */
    public double getLength() {
        return this.length;
    }

    /**
     * Set the length of the cylinder
     * @param length length of cylinder
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Get the area of the base of the cylinder
     * @return area of base of cylinder (pi * radius^2)
     */
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    /**
     * Get the volume of the cylinder
     * @return volume of cylinder (area of base * length)
     */
    public double getVolume() {
        return this.getArea() * this.length;
    }

    /**
     * Get the number of objects created
     * @return number of objects created
     */
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }
}
