import java.util.Scanner;
public class work13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the vector:");
        int size = scanner.nextInt();

        int[] vector = new int[size];

        System.out.println("Enter the elements of the vector:");
        for (int i = 0; i < size; i++) {
            vector[i] = scanner.nextInt();
        }

        int max = findMaxElement(vector);

        System.out.println("The maximum element in the vector is: " + max);
    }

    public static int findMaxElement(int[] vector) {
        int max = vector[0];

        for (int i = 1; i < vector.length; i++) {
            if (vector[i] > max) {
                max = vector[i];
            }
        }

        return max;
    }
}

