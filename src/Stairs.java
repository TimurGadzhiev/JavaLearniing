import java.util.Scanner;

public class Stairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1) {
                    System.out.print(j);
                } else {
                    System.out.print(" " + j);
                }
            }
            System.out.println();
        }
    }
}
