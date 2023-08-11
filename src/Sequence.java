import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 1; count < n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == 1) {
                    System.out.print(i);
                } else {
                    System.out.print(" " + i);
                }
                count++;
                if (count == n) {
                    break;
                }
            }
        }
    }
}