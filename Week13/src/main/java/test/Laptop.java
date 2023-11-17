package test;

/**
 * Class: CSCI1301-C Introduction to Programming Principles
 * Instructor: Md Shakil Hossain
 * Description: Test 3 Part B - Laptop class
 * Due: 10 November 2023
 * I pledge by honor that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 *
 * Sign here: Collin Jones
 */
public class Laptop {
    private String brand;
    private int price;

    /**
     * Laptop constructor
     * @param brand The brand of the laptop
     * @param price The price of the laptop
     */
    public Laptop(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    /**
     * Sets the brand of the laptop
     * @param brand The brand of the laptop
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Returns the brand of the laptop
     * @return The brand of the laptop
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets the price of the laptop
     * @param price The price of the laptop
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * Returns the price of the laptop
     * @return The price of the laptop
     */
    public int getPrice() {
        return price;
    }
}