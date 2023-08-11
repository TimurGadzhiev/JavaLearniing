import java.util.Scanner;

public class NumberFromSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String indexInput = scanner.nextLine();
        int realIndex = Integer.parseInt(indexInput);
        String[] sequence = scanner.nextLine().split(" ");
        if (realIndex > sequence.length || realIndex < 0) {
            System.out.println("Неверный ввод");
            return;
        }
        System.out.println(sequence[realIndex]);
    }
}