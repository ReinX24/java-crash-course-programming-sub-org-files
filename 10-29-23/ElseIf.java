import java.util.Scanner;

public class ElseIf {

    public static void main(String[] args) {

        // Creating a Scanner object to accept user input
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scan.nextInt(); // storing user input in "number" variable

        // Checking if the number is greater than 10 or not
        if (number > 10) {
            // Prints if the number is greater than 10
            System.out.println("Number is greater than 10");

        } else if (number <= 0) {
            // Prints if the number is less than or equal to 0
            System.out.println("Number is less than or equal to 0");

        } else {
            // Prints if the number is not greater than 10 & is not less than or equal to 0
            System.out.println("Number is less than 10");

        }

        // Closing our scanner object
        scan.close();

    }

}
