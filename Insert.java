public class Insert {
    public static void main(String[] args) {

        int[] numbers = { 10, 20, 30, 40 };
        int value = 25;
        int position = 2;
        int[] newArray = new int[numbers.length + 1];

        for (int i = 0; i < position; i++) {
            newArray[i] = numbers[i];
            newArray[position] = value;
        }

        for (int i = position; i < numbers.length; i++) {
            newArray[i + 1] = numbers[i];
        }

        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
    }
}
