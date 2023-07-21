import java.util.Scanner;

public class MaxDigitFromNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Math.abs(scanner.nextInt());
        int maxDigit = number % 10;
        while (number != 0) {
            number /= 10;
            maxDigit = Math.max(number % 10, maxDigit);
        }
        System.out.println(maxDigit);
    }
}