import java.util.Locale;
import java.util.Scanner;

public class problem11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Input an integer: ");
        double num = scan.nextDouble();
        boolean p = true;
        if (num % 2 == 0 && num != 2) {
            System.out.println("No");
            p = false;
        } else {
            for (int i = 3; i <= Math.sqrt(num); i += 2) {
                if (num % i == 0) {
                    p = false;
                    System.out.println("No");
                    break;
                }
            }
        }

        if (p) {
            System.out.println("Yes");
        }

    }
}
