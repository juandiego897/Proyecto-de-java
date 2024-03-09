import java.util.Scanner;
public class work12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the vector:");
        int size = scanner.nextInt();

        int[] vector = new int[size];

        System.out.println("Enter the elements of the vector:");
        for (int i = 0; i < size; i++) {
            vector[i] = scanner.nextInt();
        }

        int product = calculateProductOfEvenNumbers(vector);

        System.out.println("The product of all even numbers in the vector is: " + product);
    }

    public static int calculateProductOfEvenNumbers(int[] vector) {
        int product = 1;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 == 0) {
                product *= vector[i];
            }
        }

        return product;
    }
}

