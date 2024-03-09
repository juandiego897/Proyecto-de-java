import java.util.ArrayList;
import java.util.Scanner;
public class work14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter the elements of the list (enter -1 to stop):");
        int num = scanner.nextInt();
        while (num != -1) {
            list.add(num);
            num = scanner.nextInt();
        }

        removeDuplicates(list);

        System.out.println("List after removing duplicates:");
        for (int element : list) {
            System.out.print(element + " ");
        }
    }

    public static void removeDuplicates(ArrayList<Integer> list) {
        ArrayList<Integer> uniqueList = new ArrayList<>();

        for (int element : list) {
            if (!uniqueList.contains(element)) {
                uniqueList.add(element);
            }
        }

        list.clear();
        list.addAll(uniqueList);
    }
}

