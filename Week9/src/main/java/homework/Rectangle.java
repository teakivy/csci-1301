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
public class Rectangle {
    private double width;
    private double height;

    /**
     * Default constructor
     * width = 1
     * height = 1
     */
    public Rectangle() {
        this.width = 1;
        this.height = 1;
    }

    /**
     * Constructor with width and height
     * @param width width of rectangle
     * @param height height of rectangle
     */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Get the width of the rectangle
     * @return width of rectangle
     */
    public double getWidth() {
        return this.width;
    }

    /**
     * Set the width of the rectangle
     * @param width width of rectangle
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Get the height of the rectangle
     * @return height of rectangle
     */
    public double getHeight() {
        return this.height;
    }

    /**
     * Set the height of the rectangle
     * @param height height of rectangle
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Get the area of the rectangle
     * @return area of rectangle (width * height)
     */
    public double getArea() {
        return this.width * this.height;
    }

    /**
     * Get the perimeter of the rectangle
     * @return perimeter of rectangle (2 * (width + height))
     */
    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }
}
