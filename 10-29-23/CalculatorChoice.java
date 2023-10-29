import java.util.Scanner;

public class CalculatorChoice {

    public static void main(String[] args) {

        // Create a program that asks 2 numbers to perform mathematical operations on,
        // and for a number (from 1 - 4 ) and performs the mathematical arithmetic of
        // the chosen number.
        Scanner scan = new Scanner(System.in);

        System.out.print("Input First Number: ");
        int firstNum = scan.nextInt();

        System.out.print("Input Second Number: ");
        int secondNum = scan.nextInt();

        System.out.println("(1) Add (2) Subtract (3) Multiply (4) Divide");
        System.out.print("Please Input Operation Choice: ");
        int userChoice = scan.nextInt();

        // Checks if the user chooses to add (1), subtract (2), multiply (3), or divide
        // (4) their entered values
        if (userChoice == 1) {
            // Prints the sum of numbers (add)
            System.out.println("The Sum is " + (firstNum + secondNum));
        } else if (userChoice == 2) {
            // Prints the difference of the two numbers (subtract)
            System.out.println("The Difference is " + (firstNum - secondNum));
        } else if (userChoice == 3) {
            // Prints the product of the two numbers (multiply)
            System.out.println("The Product is " + (firstNum * secondNum));
        } else if (userChoice == 4) {
            // Prints the quotient of the two numbers (quotient)
            System.out.println("The Quotient is " + (firstNum / secondNum));
        }

        scan.close();

    }

}
