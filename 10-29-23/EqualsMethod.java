import java.util.Scanner;

public class EqualsMethod {

    public static void main(String[] args) {

        // To compare if two Strings are the same, user the .equals method instead of ==
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String userName = scan.nextLine();

        // Checking if entered name is "Angelo"
        if (userName.equals("Angelo")) {

            System.out.println("Hello Angelo!");

        } else {

            System.out.println("Who are you?");

        }

        scan.close();

    }

}
