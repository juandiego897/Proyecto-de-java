import java.util.Scanner;
public class work11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the vector:");
        int size = scanner.nextInt();

        int[] vector = new int[size];

        System.out.println("Enter vector elements:");
        for (int i = 0; i < size; i++) {
            vector[i] = scanner.nextInt();
        }

        int sum = sumvector(vector);

        System.out.println("The sum of all the elements of the vector is: " + sum);
    }

    public static int sumvector(int[] vector) {
        int sum = 0;

        for (int i = 0; i < vector.length; i++) {
            sum += vector[i];
        }

        return sum;
    }
}

