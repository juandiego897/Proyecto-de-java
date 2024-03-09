import java.util.Scanner;
public class work2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount of money in the original currency:");
        double cantidadOriginal = scanner.nextDouble();

        System.out.println("Enter the exchange rate from the original currency to the destination currency:");
        double tasaCambio = scanner.nextDouble();

        double cantidadDestino = cantidadOriginal * tasaCambio;

        System.out.println("The amount of money in the destination currency is: " + cantidadDestino);
    }
}