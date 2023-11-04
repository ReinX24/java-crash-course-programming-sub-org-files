public class PrintingStringArrays {

    public static void main(String[] args) {

        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };

        // Integer value that we will be using to print each element for each indes
        int index = 0;

        // Printing each element in our cars array
        while (index < cars.length) {
            System.out.println(cars[index]);
            index++;
        }

        // Printing the length / amount of elements in our array
        System.out.println(cars.length); // prints 4 since we have 4 elements

    }

}
