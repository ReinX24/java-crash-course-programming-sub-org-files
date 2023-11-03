public class NestedWhileLoop {

    public static void main(String[] args) {

        int counter1 = 0;
        while (counter1 < 5) {
            int counter2 = 0;

            while (counter2 < 5) {
                System.out.println(counter1 + " " + counter2);
                counter2++;
            }
            counter1++;
        }

    }

}