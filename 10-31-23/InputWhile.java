import java.util.Scanner;

public class InputWhile {

    public static void main(String[] args) {

        // Creating a Scanner object to accept user input
        Scanner scan = new Scanner(System.in);

        // Asking the user to enter a number, that number will print our message a
        // number of times
        System.out.print("Enter a number: ");
        int index = scan.nextInt();

        // Example: if we type in 5 as our number, "Hello" will print 5 times
        while (index > 0) {
            System.out.println("Hello");
            index = index - 1;
        }

        // Operation shortcuts

        // Incrementing a value
        // index = index + 1
        // index++;
        // index += 1;

        // Decrementing a value
        // index = index - 1
        // index--;
        // index -= 1;

        scan.close();

    }

}
