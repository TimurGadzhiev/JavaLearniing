import java.util.Scanner;

public class NumberFromSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        String str = "";
        while(scanner.hasNextLine()) {
            str = scanner.nextLine();
        }
        String[] arr = str.split(" ");
        if (index > arr.length) {
            System.out.println("Неверный ввод");
            return;
        }
        System.out.println(arr[index]);
    }
}