public class SearchArray {
    public static void main(String[] args) {
        int[] numbers = { 12, 7, 25, 18, 9 };

        int search = 18;
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == search) {
                found = true;

            }

        }

        if (found) {
            System.out.println("Number found");
        } else {
            System.out.println("Number not found");
        }

    }
}
