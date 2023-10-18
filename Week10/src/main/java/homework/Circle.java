package homework;


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
public class Circle {
    private double radius;
    private double centerX;
    private double centerY;

    /**
     * Constructor for Circle
     *
     * @param radius radius of the circle
     * @param centerX center x coordinate of the circle
     * @param centerY center y coordinate of the circle
     */
    public Circle(double radius, double centerX, double centerY) {
        this.radius = radius;
        this.centerX = centerX;
        this.centerY = centerY;
    }

    /**
     * Constructor for Circle
     * radius = 1
     * centerX = 1
     * centerY = 1
     */
    public Circle() {
        this(1, 1, 1);
    }

    /**
     * Get the radius of the circle
     *
     * @return radius of the circle
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Set the radius of the circle
     *
     * @param radius radius of the circle
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Get the center x coordinate of the circle
     *
     * @return center x coordinate of the circle
     */
    public double getCenterX() {
        return centerX;
    }

    /**
     * Set the center x coordinate of the circle
     *
     * @param centerX center x coordinate of the circle
     */
    public void setCenterX(double centerX) {
        this.centerX = centerX;
    }

    /**
     * Get the center y coordinate of the circle
     *
     * @return center y coordinate of the circle
     */
    public double getCenterY() {
        return centerY;
    }

    /**
     * Set the center y coordinate of the circle
     *
     * @param centerY center y coordinate of the circle
     */
    public void setCenterY(double centerY) {
        this.centerY = centerY;
    }

    /**
     * Get the distance between this circle and another circle
     * @param c the other circle
     * @return the distance between the two circles
     */
    public double distance(Circle c) {
        return Math.sqrt(Math.pow(this.centerX - c.centerX, 2) + Math.pow(this.centerY - c.centerY, 2));
    }
}
