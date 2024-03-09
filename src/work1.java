import java.util.Scanner;
public class work1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a year, only numbers please:");
        int year = scanner.nextInt();

        if (isleap(year)) {
            System.out.println(year + " this year is leap year");
        } else {
            System.out.println(year + " this year is not a leap year.");
        }
    }

    public static boolean isleap(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }
}