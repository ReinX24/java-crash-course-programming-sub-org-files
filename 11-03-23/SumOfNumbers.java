import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        // Write a program that inputs a number, and then the user inputs that amount of
        // integers one by one, print the sum as the result.

        // Example:
        // Input amount of numbers: 4
        // 6
        // 3
        // 4
        // 5
        // The sum is: 18

        // We type in 4 numbers (6, 3, 4, 5) because we typed in 4 when we are asked to
        // input the amount of numbers to be entered

        Scanner userInput = new Scanner(System.in);

        System.out.print("Input amount of numbers: ");
        int numberAmount = userInput.nextInt();

        int totalAmount = 0;

        // This loop will ask a total amount of integers from the first user input
        for (int i = 1; i <= numberAmount; i++) {
            System.out.print("Enter #" + i + ": ");
            totalAmount += userInput.nextInt(); // adds entered number to totalAmount
        }

        System.out.println("The sum is: " + totalAmount);
        userInput.close();

    }

}
