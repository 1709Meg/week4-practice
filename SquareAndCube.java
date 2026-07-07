public class SquareAndCube {
    public static void main(String[] args) {
        int[] numbers = { 2, 3, 4 };

        int[] squares = new int[numbers.length];
        int[] cubes = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {

            squares[i] = numbers[i] * numbers[i];

            cubes[i] = numbers[i] * numbers[i] * numbers[i];

        }
    }
}