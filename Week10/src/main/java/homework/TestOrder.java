package homework;

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
public class TestOrder {
    public static void main(String[] args) {
        // Create the orders
        Order order1 = new Order("One PC");
        Order order2 = new Order("Two Cars");
        Order order3 = new Order("Three Baskets");

        // Modify Order 1
        order1.cancel();

        // Modify Order 2
        order2.ship();
        order2.setShippingAddress("91  Oliverio Drive");
        order2.setBillingAddress("255 Counts Lane");
        order2.setPhoneNumber("(620)-562-5212");

        // Modify Order 3
        order3.setShippingAddress("123 Ave Street");
        order3.setBillingAddress("67 North Lane");
        order3.setPhoneNumber("(999)-999-9999");

        // Print the orders
        System.out.println("Order 2's Name: " + order2.getOrderName());
        System.out.println("Order 3's Date: " + order3.getDate().toString());
        System.out.println("Order 2's Status: " + order2.getStatus());
        System.out.println("Order 3's Shipping Address: " + order3.getShippingAddress());
        System.out.println("Order 2's Billing Address: " + order2.getBillingAddress());
        System.out.println("Order 3's Number: " + order3.getPhoneNumber());

        System.out.println("The number of orders is: " + Order.getTotalOrder());

        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order3);
    }
}
