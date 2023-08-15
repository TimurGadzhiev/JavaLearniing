import java.util.Scanner;

public class MatrixSize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        String temp = "";
        while (scanner.hasNextLine()) {
            String arr = scanner.nextLine();
            i++;
            temp = arr.charAt(arr.length() - 1) + "";
        }
        int columns = Integer.parseInt(temp);
        columns = columns/i;
        System.out.println("Строк: " + i);
        System.out.println("Столбцов: " + columns);
    }
}
