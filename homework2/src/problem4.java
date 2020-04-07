import java.util.Locale;
import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Please input integer number : ");
        double num = scan.nextDouble();
        if (num % 2 == 0) {
            System.out.println("true");
        } else {
            System.out.println(" false ");
        }
    }
}
