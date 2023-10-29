import java.util.Scanner;

public class ElseIfOperations {

    public static void main(String[] args) {

        // Creating a Scanner object to accept user input
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scan.nextInt(); // storing user input in "number" variabl

        // Checks if the entered number is 1 or 2
        if (number == 1) {
            // Prints the sum of 23 and 11
            System.out.println(23 + 11);

        } else {
            // Prints the difference of 23 and 11
            System.out.println(23 - 11);

        }

        scan.close();

    }

}