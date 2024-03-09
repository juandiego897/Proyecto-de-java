import java.util.Scanner;
public class work2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount of money in the original currency:");
        double OriginalQuantity = scanner.nextDouble();

        System.out.println("Enter the exchange rate from the original currency to the destination currency:");
        double ChangeRate = scanner.nextDouble();

        double DestinationQuantity = OriginalQuantity * ChangeRate;

        System.out.println("The amount of money in the destination currency is: " + DestinationQuantity);
    }
}