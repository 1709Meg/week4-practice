public class IncrementArray {
    public static void main(String[] args) {

        int[] numbers = { 7, 9, 15 };

        for (int i = 0; i < numbers.length; i++) {
            numbers[i]++;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}