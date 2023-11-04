public class PrintingSumArrays {

    public static void main(String[] args) {

        // Creating an array of integers
        int[] numbers = { 3, 7, 21, 5, 68, 42, 1, 6 };

        // Creating a variable that will store the sum of all the elements
        int numTotal = 0;

        // Looping through our numbers array and adding each element to numTotal
        for (int i = 0; i < numbers.length; i++) {
            numTotal += numbers[i];
        }

        System.out.println("The sum is " + numTotal);

    }

}
