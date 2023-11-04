public class StringArrays {

    public static void main(String[] args) {

        // Initializing a String
        String name = "Word";

        // Initializing a String array
        String[] names = { "Volvo", "BMW", "Ford", "Mazda" };
        String[] stringArr = new String[5]; // String array that can hold 5 values

        /*
         * Arrays start with 0 as their starting index. In the names array, the first
         * element has the index 0, the second element 1, and so on.
         */

        // Initializing the size of an array using variables
        int arrLength = 5;
        String[] anotherStringarray = new String[arrLength];

        // Printing certain array elements
        // Printing the "Ford" element in names array, we access index 2 or the third
        // element in the names array
        System.out.println(names[2]); // prints "Ford"

    }

}