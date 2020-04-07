import java.util.Locale;
import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Please input 2 double numbers...");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        if ((num1 > 0 && num1 < 1) && (num2 > 0 && num1 < 2)) {
            System.out.println("true");
        } else {
            System.out.println(" false ");
        }
    }

}
