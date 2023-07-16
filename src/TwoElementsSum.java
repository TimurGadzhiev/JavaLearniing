import java.util.Scanner;

public class TwoElementsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] sequence = input.split(" ");
        int length = sequence.length;
        if (length < 3) {
            System.out.println(0);
            return;
        }

        int[] sequenceOfNumbers = new int[length];
        for (int i = 0; i < length; i++) {
            sequenceOfNumbers[i] = Integer.parseInt(sequence[i]);
        }

        int smallestSum = sequenceOfNumbers[0] + sequenceOfNumbers[2];

        for (int i = 1; i < length - 2; i++) {
            int currentSum = sequenceOfNumbers[i] + sequenceOfNumbers[i + 2];
            if (currentSum < smallestSum) {
                smallestSum = currentSum;
            }
        }
        System.out.println(smallestSum);
    }
}
