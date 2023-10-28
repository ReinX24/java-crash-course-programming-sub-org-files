public class Arithmethic {

    public static void main(String[] args) {

        // Doing arithmetic operations on variables
        // addition: +
        // difference: -
        // multiplication: *
        // division: /

        String name = "Angelo ";
        int num1 = 23;
        int num2 = 11;

        // Storing our arithmetic opertion inside varibles
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;

        // Printing the values of our computed results
        System.out.println(sum); // 34
        System.out.println(difference); // 12
        System.out.println(product); // 253
        System.out.println(quotient); // 2
        // ^ this prints 2 without the remainder because dividing integers in java does
        // not give a decimal value

        // String concatenation, printing a String and a variable value inside a print
        // statement
        System.out.println(name + num1); // prints "Angelo 23"

        // Printing our variables with a String
        System.out.println("The Sum is " + sum); // prints "The Sum is 34"
        System.out.println("The Difference is " + difference); // prints "The Difference is 12"
        System.out.println("The Product is " + product); // prints "The Product is 253"
        System.out.println("The Quotient is " + quotient); // prints "The Quotient is 2"

    }

}
