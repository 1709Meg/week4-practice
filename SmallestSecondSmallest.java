public class SmallestSecondSmallest {
    public static void main(String[] args) {
        int[] numbers = { 2, 6, 13, 78 };

        int smallest;
        int secondSmallest;

        if (numbers[0] > numbers[1]) {
            secondSmallest = numbers[0];
            smallest = numbers[1];
        } else {
            smallest = numbers[0];
            secondSmallest = numbers[1];
        }
        for (int i = 2; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                secondSmallest = smallest;
                smallest = numbers[i];
            } else if (numbers[i] > smallest && numbers[i] < secondSmallest) {
                secondSmallest = numbers[i];
            }
        }
        System.out.println("Smallest = " + smallest);
        System.out.println("Second Smallest = " + secondSmallest);
    }
}
