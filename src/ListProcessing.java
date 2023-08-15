import java.util.LinkedList;
import java.util.Scanner;

public class ListProcessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] create = scanner.nextLine().split(" "); //create
        int size = Integer.parseInt(create[1]);
        LinkedList<Integer> array = new LinkedList<>();
        for (int i = 1; i <= size; i++) {
            array.add(i);
        }
        int count = 0;
        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            if (str.contains("add")) { //add
                if (str.indexOf(" ", 4) >= 1) { // add x y
                    String[] temp = str.split(" ");
                    int index = Integer.parseInt(temp[1]);
                    int additionalElement = Integer.parseInt(temp[2]);
                    array.add(index, additionalElement);
                    continue;
                } else {
                    String[] temp = str.split(" "); //add x
                    int additionalElement = Integer.parseInt(temp[1]);
                    array.add(additionalElement);
                    continue;
                }
            }
            if (str.contains("remove")) { //remove x
                String[] temp = str.split(" ");
                int index = Integer.parseInt(temp[1]);
                array.remove(index);
                continue;
            }

            if (str.contains("set")) {//set x y
                String[] temp = str.split(" ");
                int index = Integer.parseInt(temp[1]);
                int value = Integer.parseInt(temp[2]);
                array.set(index, value);
                continue;
            }
            if (str.equals("printList")) { //printList
                for (int number : array) {
                    if (count == 0) {
                        System.out.print(number);
                    } else {
                        System.out.print(" " + number);
                    }
                    count++;
                }
                return;
            }
        }
    }
}