import java.util.Scanner;
public class work9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first positive integer:");
        int number1 = scanner.nextInt();

        System.out.println("Enter the second positive integer:");
        int number2 = scanner.nextInt();

        int mcd = calculateMCD(number1, number2);

        System.out.println("The maximum common factor of " + number1 + " and " + number2 + " is: " + mcd);
    }

    public static int calculateMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
