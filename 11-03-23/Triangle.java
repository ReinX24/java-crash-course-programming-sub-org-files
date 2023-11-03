import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {

        // NOTE for sending code in discord: ```java (enter code here)```

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter Triangle height: ");
        int triangleHeight = userInput.nextInt();

        for (int i = 0; i < triangleHeight; i++) {

            // Printing spaces before each start
            for (int j = 0; j < triangleHeight - i; j++) {
                System.out.print(" ");
            }

            // Printing a certain amount of starts for each line
            for (int j = 0; j < (2 * i) + 1; j++) {
                System.out.print("*");
            }

            // Breaks the triangle into a new line
            System.out.println();
        }

        userInput.close();

    }

}
