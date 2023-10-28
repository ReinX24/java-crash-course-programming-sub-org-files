import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNum = scan.nextInt(); // we use nextInt since we are storing an integer

        System.out.print("Enter the second number: ");
        int secondNum = scan.nextInt();

        // Adding, subtracting, multiplying, and dividing our entered inputs
        int sumNum = firstNum + secondNum;
        int differenceNum = firstNum - secondNum;
        int productNum = firstNum * secondNum;
        int quotientNum = firstNum / secondNum;

        System.out.println("The Sum is " + sumNum); // prints "The Sum is 34"
        System.out.println("The Difference is " + differenceNum); // prints "The Difference is 12"
        System.out.println("The Product is " + productNum); // prints "The Product is 253"
        System.out.println("The Quotient is " + quotientNum); // prints "The Quotient is 2"

        // Closing our Scanner object
        scan.close();

    }

}
