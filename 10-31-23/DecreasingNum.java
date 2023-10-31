import java.util.Scanner;

public class DecreasingNum {

    public static void main(String[] args) {

        // Create a program that inputs a number, and prints the number decrementing by
        // one until it reaches 1

        Scanner scan = new Scanner(System.in);

        System.out.print("Input a Number: ");
        int userNumber = scan.nextInt();

        while (userNumber > 0) {
            System.out.println(userNumber);
            userNumber -= 1; // decrements userNumber by 1
        }

        scan.close();

    }

}
