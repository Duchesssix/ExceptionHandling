package com.company;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        /**
         * declare and initialize variables
         */
        /**
         * Get user input
         */
        Scanner scanner = new Scanner(System.in);
        int selection = 0;
        String buffer = "";
        /**
         * user indicates end of program
         */
        boolean exit = false;

        /**
         * display menu options
         */
        do {
            System.out.println("\nEnter selection");
            System.out.println("1. Residential");
            System.out.println("2. Commercial");
            System.out.println("3. Exit");

            /**
             * get user menu selection
             * selection retrieved as a string and converted to int to consume newline
             */

            buffer = scanner.nextLine();
            selection = Integer.parseInt(buffer);

            switch(selection) {
                /**
                 * Create residential Customer
                 */
                case 1:
                    Residential.getResidentialInfo();
                    Residential cust1 = new Residential (Customer.getCustName(), Customer.getCustPhone(),
                            Customer.getCustAddress(), Customer.getSqFootage(),
                            Residential.getResRate(), Residential.getSenior());
                    cust1.printAllRes();
                    selection = 0;
                    break;
                /**
                 * Create commercial Customer
                 */
                    case 2:
                    Commercial.getCommercialInfo();
                    Commercial comm1 = new Commercial (Customer.getCustName(), Customer.getCustPhone(),
                            Customer.getCustAddress(), Customer.getSqFootage(),
                            Commercial.getComRate(), Commercial.getPropertyName(), Commercial.getMulti());
                    comm1.printAllCom();
                    break;
                /**
                 * exit program
                 */
                    case 3:
                    exit = true;
                    break;
                /**
                 * invalid selection
                 */
                default:
                    System.out.println("Invalid selection, please try again.");
                    break;
            }
        }while(!exit);

    }


}
