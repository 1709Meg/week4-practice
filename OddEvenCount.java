public class OddEvenCount {
    public static void main(String[] args) {
        int[] numbers = { 4, 7, 2, 8, 10, 5 };
        int evenCount = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 0) {
                evenCount++;
            }

        }
        System.out.println("Number of even = " + evenCount);
    }
}
