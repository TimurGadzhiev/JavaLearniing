import java.util.Scanner;

public class CreatingArrayOfStrings {
    //FIXME
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amountLines = scanner.nextInt();
        String[][] lines = new String[amountLines][];
        for (int i = 0; i < amountLines; i++) {
            String line = scanner.nextLine();
            lines[i][i] = line;
        }
        for (String[] arrayOfLine : lines) {
            for (String temp : arrayOfLine) {
                System.out.println(temp);
            }
        }
    }
}