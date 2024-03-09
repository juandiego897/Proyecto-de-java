import java.util.Scanner;
public class work5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive integer:");
        int number = scanner.nextInt();

        int sumDigits = addDigits(number);

        System.out.println("The sum of the digits of the number is: " + sumDigits);
    }

    public static int addDigits(int number) {
        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
}
