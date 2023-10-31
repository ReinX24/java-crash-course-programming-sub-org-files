import java.util.Scanner;

public class FibonacciSequenceChallenge {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter fibonacci length: ");
        int endIndex = scan.nextInt();

        int n1 = 0;
        int n2 = 1;

        for (int i = 0; i < endIndex; i++) {
            if (i != endIndex - 1) {
                System.out.print(n1 + ", ");
            } else {
                System.out.println(n1);
            }
            int nextInt = n1 + n2;
            n1 = n2;
            n2 = nextInt;
        }

        scan.close();

    }

}
