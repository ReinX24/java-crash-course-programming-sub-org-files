import java.util.Scanner;

public class ElementInArray {

    public static void main(String[] args) {

        // Creating a Scanner object to accept user input
        Scanner userInput = new Scanner(System.in);

        int[] numbers = { 3, 7, 21, 5, 68, 42, 1, 6 };

        // Asking the user for a number inside the array
        System.out.print("Enter a number in the array: ");
        int userNumber = userInput.nextInt();

        // Initializing a variable that will store the index of our userNumber when
        // found in numbers array
        int numIndex = -1; // start at -1

        // Finding the entered number within the array
        for (int i = 0; i < numbers.length; i++) {
            // Checking if the current iterated element in numbers array is equals to our
            // entered userNumber
            if (numbers[i] == userNumber) {
                numIndex = i;
                break; // breaks the loop once the index of entered userNumber is found
            }
        }

        // Checking if the entered userNumber is found
        if (numIndex == -1) {
            // Prints if the entered userNumber is not found
            System.out.println("Entered number does not exist in array!");
        } else {
            // Prints if the entered userNumber is found at a certain index
            System.out.println(userNumber + " is found at index " + numIndex + " in numbers array");
        }

        userInput.close();
    }

}
