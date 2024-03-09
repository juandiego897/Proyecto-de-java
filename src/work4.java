import java.util.Scanner;
public class work4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the initial amount invested:");
        double main = scanner.nextDouble();

        System.out.println("Enter the annual interest rate (in percentage):");
        double RateInterestAnnual = scanner.nextDouble() / 100;

        System.out.println("Enter the number of years:");
        int numberyears = scanner.nextInt();

        double FinalAmount = main * Math.pow(1 + RateInterestAnnual, numberyears);

        System.out.println("The final amount after " + numberyears + " years is: " + FinalAmount);
    }
}

