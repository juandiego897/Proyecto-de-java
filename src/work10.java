import java.util.Scanner;
public class work10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive integer:");
        int number = scanner.nextInt();

        System.out.println("Enter a digit:");
        int digit = scanner.nextInt();

        int counter = countDigits(number, digit);

        System.out.println("the dígit " + digit + " appears " + counter + " times in number " + number+ ".");
    }

    public static int countDigits(int number, int digit) {
        int counter = 0;
        char digitChar = (char) (digit + '0');
        String numberStr = Integer.toString(number);

        for (int i = 0; i < numberStr.length(); i++) {
            if (numberStr.charAt(i) == digitChar) {
                counter++;
            }
        }

        return counter;
    }
}
