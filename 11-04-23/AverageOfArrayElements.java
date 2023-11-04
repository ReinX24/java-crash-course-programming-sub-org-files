public class AverageOfArrayElements {

    public static void main(String[] args) {

        int[] numbers = { 3, 7, 21, 5, 68, 42, 1, 6 };

        int numAverage = 0;

        // Adding all the values of numbers array to numAverage
        for (int i = 0; i < numbers.length; i++) {
            numAverage += numbers[i];
        }

        // Dividing the numAverage with the number array length to get the average
        numAverage /= numbers.length;

        System.out.println("Average: " + numAverage);

    }

}
