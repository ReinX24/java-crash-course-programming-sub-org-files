public class FibonacciSequence {

    public static void main(String[] args) {

        int n1 = 0;
        int n2 = 1;
        // Printing the first 15 values of the fibonacci sequence
        // Starts from the second index (third sequence) in the fibonacci sequence
        for (int i = 0; i < 15; i++) {
            if (i != 15 - 1) {
                System.out.print(n1 + ", ");
            } else {
                System.out.println(n1);
            }
            int nextInt = n1 + n2;
            n1 = n2;
            n2 = nextInt;
        }

    }

}
