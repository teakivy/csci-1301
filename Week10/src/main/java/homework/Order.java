package homework;

import java.util.Date;

/**
 * Class: CSCI 1301 Programming Principles I C, Fall 2023
 * Instructor: Md Shakil Hossain
 * Description: Homework 7
 * Due: 22 October 2023
 * I pledge by honor that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 *
 * Sign here: Collin Jones
 */
public class Order {
    public static final int ON_ORDER = 0;
    public static final int CANCELED = 1;
    public static final int SHIPPED = 2;
    private static int totalOrder = 0;

    private String orderName;
    private Date date;
    private int status;
    private String shippingAddress;
    private String phoneNumber;
    private String billingAddress;

    /**
     * Constructor for Order
     * @param name name of the order
     */
    public Order(String name) {
        // Set the name
        this.orderName = name;
        // Add the order
        totalOrder++;
        // Set the status
        this.status = ON_ORDER;
        // Set the order date
        this.date = new Date();
    }

    /**
     * Cancel the order and set the cancel date
     */
    public void cancel() {
        this.date = new Date();
        this.status = CANCELED;
    }

    /**
     * Ship the order and set the ship date
     */
    public void ship() {
        this.date = new Date();
        this.status = SHIPPED;
    }

    /**
     * Set the shipping address
     *
     * @param a shipping address
     */
    public void setShippingAddress(String a) {
        this.shippingAddress = a;
    }

    /**
     * Set the phone number
     *
     * @param p phone number
     */
    public void setPhoneNumber(String p) {
        this.phoneNumber = p;
    }

    /**
     * Set the billing address
     *
     * @param add billing address
     */
    public void setBillingAddress(String add) {
        this.billingAddress = add;
    }

    /**
     * Get the total number of orders
     *
     * @return total number of orders
     */
    public static int getTotalOrder() {
        return totalOrder;
    }

    /**
     * Get the order name
     *
     * @return order name
     */
    public String getOrderName() {
        return this.orderName;
    }

    /**
     * Get the order date
     * Note: This could be the order, cancel, or ship date
     *
     * @return order date
     */
    public Date getDate() {
        return this.date;
    }

    /**
     * Get the order status
     * 0 = on order
     * 1 = cancelled
     * 2 = shipped
     *
     * @return order status
     */
    public int getStatus() {
        return this.status;
    }

    /**
     * Get the shipping address
     *
     * @return shipping address
     */
    public String getShippingAddress() {
        return this.shippingAddress;
    }

    /**
     * Get the phone number
     *
     * @return phone number
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * Get the billing address
     *
     * @return billing address
     */
    public String getBillingAddress() {
        return this.billingAddress;
    }

    /**
     * Get the order as a string
     * @return order as a string
     */
    public String toString() {
        // Create the string builder

        return "Order Name: " + this.orderName +
                "| Date: " + this.date.toString() +
                "| Status: " + this.status +
                "| Shipping Address: " + this.shippingAddress +
                "| Billing Address: " + this.billingAddress +
                "| Phone Number: " + this.phoneNumber;
    }
}
