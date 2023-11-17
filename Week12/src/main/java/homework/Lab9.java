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
public class Lab9 {
    private final static int WIDTH = 2;
    private final static int HEIGHT = 3;

    public static void main(String[] args) {
        MyPoint[][] points = new MyPoint[WIDTH][HEIGHT];

        // Create the points
        points[0][0] = new MyPoint(.5, 1.2);
        points[0][1] = new MyPoint(0, 3.14);
        points[0][2] = new MyPoint(15, 27.5);
        points[1][0] = new MyPoint(6.6, 7.7);
        points[1][1] = new MyPoint(1.2, 2.1);
        points[1][2] = new MyPoint(12, 127);

        // Print the points
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                System.out.println("Array[" + i + "][" + j + "] = " + points[i][j].toString());
            }
        }
    }
}
