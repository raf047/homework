import java.util.Locale;
import java.util.Scanner;

public class problem12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Input an integer: ");
        double num = scan.nextDouble();
        for (int i = 1; i <= num * num; i++) {
            if (i % 2 == 0) {
                System.out.print(" white ");
            } else {
                System.out.print(" black ");
            }
            if (i % num == 0) {
                System.out.println();
            }
        }
    }
}
