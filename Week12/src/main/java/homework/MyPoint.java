package homework;

/**
 * Class: CSCI 1301 Programming Principles I C, Fall 2023
 * Instructor: Md Shakil Hossain
 * Description: Lab 9
 * Due: 3 November 2023
 * I pledge by honor that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 *
 * Sign here: Collin Jones
 */
public class MyPoint {
    private double x;
    private double y;

    /**
     * Constructor for MyPoint with default values
     */
    public MyPoint() {
        this(0, 0);
    }

    /**
     * Constructor for MyPoint
     * @param x x coordinate of the point
     * @param y y coordinate of the point
     */
    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Get the x coordinate of the point
     * @return x coordinate of the point
     */
    public double getX() {
        return this.x;
    }

    /**
     * Get the y coordinate of the point
     * @return y coordinate of the point
     */
    public double getY() {
        return this.y;
    }

    /**
     * Set the x coordinate of the point
     * @param x x coordinate of the point
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Set the y coordinate of the point
     * @param y y coordinate of the point
     */
    public void setY(double y) {
        this.y= y;
    }

    /**
     * Convert the point to a string
     * @return string representation of the point (x, y)
     */
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}
