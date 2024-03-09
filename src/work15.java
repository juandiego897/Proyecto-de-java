import java.util.ArrayList;
import java.util.Scanner;
public class work15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter the elements of the list (enter -1 to stop):");
        int num = scanner.nextInt();
        while (num != -1) {
            list.add(num);
            num = scanner.nextInt();
        }

        removeOddElements(list);

        System.out.println("List after removing odd elements:");
        for (int element : list) {
            System.out.print(element + " ");
        }
    }

    public static void removeOddElements(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) {
                list.remove(i);
                i--;
            }
        }
    }
}



