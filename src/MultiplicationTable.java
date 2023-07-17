import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amountColumns = scanner.nextInt();
        int amountLines = scanner.nextInt();
        for (int i = 1; i <= amountColumns; i++) {
            for (int j = 1; j <= amountLines; j++) {
                if (j == 1) {
                    System.out.print(i * j);
                } else if (j > 1) {
                    System.out.print(" " + i * j);
                }

            }
            System.out.println();
        }
    }
}