import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

        // Creating a Scanner object to accept user input
        Scanner scan = new Scanner(System.in);

        // Asking the user to enter a number and storing in a variable
        System.out.print("Enter a number: ");
        int number = scan.nextInt(); // storing user input in "number" variable

        // Checking if the number is greater than 10 or not
        if (number > 10) {
            // Prints if the number is greater than 10
            System.out.println("Number is greater than 10");

        } else {
            // Prints if the number is not greater than 10
            System.out.println("Number is less than 10");

        }

        // Closing our scanner object
        scan.close();

        /*
         * Different comparators:
         * equal ==
         * not equal !=
         * greater than >
         * less than <
         * greater than or equal >=
         * less than or equal <=
         */

    }

}