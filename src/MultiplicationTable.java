import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amountLines = scanner.nextInt();
        int amountColumns = scanner.nextInt();
        for (int i = 1; i <= amountLines; i++) {
            for (int j = 1; j <= amountColumns; j++) {
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