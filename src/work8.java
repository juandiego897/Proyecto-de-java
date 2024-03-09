import java.util.Random;
import java.util.Scanner;
public class work8 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int number1 = random.nextInt(10) + 1;
        int number2 = random.nextInt(10) + 1;

        int sum = number1 + number2;

        System.out.println("Enter the sum of the following two numbers: " + number1 + " + " + number2);
        int answer = scanner.nextInt();

        if (answer == sum) {
            System.out.println("Correct answer");
        } else {
            System.out.println("Wrong answer, The correct sum is: " + sum);
        }
    }
}
