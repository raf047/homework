import java.util.Locale;
import java.util.Scanner;

public class problem9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Input seconds: ");
        int x = scan.nextInt();
        int y = scan.nextInt();
        if (x * y > 0 || (x == 0 && y == 0))
            System.out.println(" TRUE ");
        else
            System.out.println(" FALSE ");
    }
}
