public class LargestSecondLargest {
    public static void main(String[] args) {
        int[] numbers = { 8, 3, 12, 5 };

        int largest;
        int secondLargest;

        if (numbers[0] > numbers[1]) {
            largest = numbers[0];
            secondLargest = numbers[1];
        } else {
            largest = numbers[1];
            secondLargest = numbers[0];
        }
        for (int i = 2; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
            } else if (numbers[i] < largest && numbers[i] > secondLargest) {
                secondLargest = numbers[i];
            }
        }
        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + secondLargest);
    }
}
