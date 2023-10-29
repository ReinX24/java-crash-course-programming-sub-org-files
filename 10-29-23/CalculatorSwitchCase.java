import java.util.Scanner;

public interface CalculatorSwitchCase {

    public static void main(String[] args) {

        // Convert the if-else code from Activity #3 into a switch case format
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

        switch (userChoice) {
            case 1:
                // Prints the sum of numbers (add)
                System.out.println("The Sum is " + (firstNum + secondNum));
                break;

            case 2:
                // Prints the difference of the two numbers (subtract)
                System.out.println("The Difference is " + (firstNum - secondNum));
                break;

            case 3:
                // Prints the product of the two numbers (multiply)
                System.out.println("The Product is " + (firstNum * secondNum));
                break;

            case 4:
                // Prints the quotient of the two numbers (quotient)
                System.out.println("The Quotient is " + (firstNum / secondNum));
                break;

        }

        scan.close();

    }

}
