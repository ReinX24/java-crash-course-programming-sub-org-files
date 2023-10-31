import java.util.Scanner;

public class SquareNum {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Input a Number: ");
        int userNumber = scan.nextInt();

        // Printing the square of each number
        while (userNumber > 0) {
            System.out.println(userNumber * userNumber);
            userNumber -= 1;
        }

        scan.close();

    }

}
