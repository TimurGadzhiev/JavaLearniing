import java.util.Scanner;

public class ArraysLesson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] words = str.split(" ");
        int shortestWordIndex = 0;
        for (int i = 1; i < words.length; i++) {
            if (words[shortestWordIndex].length() > words[i].length()) {
                shortestWordIndex = i;
            }
        }
        System.out.println(shortestWordIndex + 1);
    }
}