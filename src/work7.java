import java.util.Scanner;
public class work7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first integer:");
        int number1 = scanner.nextInt();

        System.out.println("Enter the second integer:");
        int number2 = scanner.nextInt();

        System.out.println("Enter the third whole number:");
        int number3 = scanner.nextInt();

        int high = number1;
        if (number2 > high) {
            high = number2;
        }
        if (number3 > high) {
            high = number3;
        }

        int less = number1;
        if (number2 < less) {
            less = number2;
        }
        if (number3 < less) {
            less = number3;
        }

        int intermediate = number1 + number2 + number3 - high - less;

        System.out.println("The numbers in ascending order are:");
        System.out.println(less);
        System.out.println(intermediate);
        System.out.println(high);
    }
}
