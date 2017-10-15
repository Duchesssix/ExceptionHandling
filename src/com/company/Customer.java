package com.company;
import java.util.Scanner;

/**
 * Parent Customer class
 */
public class Customer {
    /**
     * declare all base class variables as private
     */
    private static String custName = "";
    private static String custPhone = "";
    private static String custAddress = "";
    private static double sqFootage = 0.00;

    private static String buffer = "";

    private static Scanner scanner = new Scanner(System.in); // to get user input

    /**
     * create base class constructor
     * @param custName
     * @param custPhone
     * @param custAddress
     * @param sqFootage
     */
    public Customer(String custName, String custPhone, String custAddress, double sqFootage) {
        this.custName = custName;
        this.custPhone = custPhone;
        this.custAddress = custAddress;
        this.sqFootage = sqFootage;

    }

    /**
     * create base class getters and setters for data access
     * @return
     */
    public static String getCustName() {
        return custName;
    }

    public static String getCustPhone() {
        return custPhone;
    }

    public static String getCustAddress() {
        return custAddress;
    }

    public static double getSqFootage() {
        return sqFootage;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public void setSqFootage(double sqFootage) {
        this.sqFootage = sqFootage;
    }

    /**
     * base class method to get customer data from user via console
     */
    public static void getCustomerInfo() {

        System.out.println("Please enter customer name: ");
        custName = scanner.nextLine();
        System.out.println("Please enter customer phone (###-###-####): ");
        custPhone = scanner.nextLine();
        System.out.println("Please enter customer address: ");
        custAddress= scanner.nextLine();

        System.out.println("Please enter square footage of property: ");
            //selection retrieved as a string and converted to double to consume newline
            buffer = scanner.nextLine();
            sqFootage = Double.parseDouble(buffer);
            System.out.println("Input must be a numeric value");


    }

    /**
     *  base class method to print customer data to console
     */

    public static void printAll() {
        System.out.println("Customer Name: " + custName +
                "\nCustomer Phone: " + custPhone + "\nCustomer Address: " +
                custAddress + "\nSquare Footage: " + sqFootage);
    }
}
