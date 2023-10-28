import java.util.Scanner; // we need to import the Scanner class so that we can use it in our program

public class NameInput {

    public static void main(String[] args) {

        // Creating a Scanner object
        Scanner scan = new Scanner(System.in);

        // This will make it that we are able to type in our console
        // After we type in our input and press enter, that input will be stored in the
        // name variable
        System.out.print("Enter your name: ");
        String name = scan.nextLine();

        // Printing our name variable
        System.out.println("Your name is " + name);

        // Closing our Scanner object
        scan.close();
    }

}
