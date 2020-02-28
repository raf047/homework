import java.util.Locale;
import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Input an integer: ");
        int x = scan.nextInt();
        double i = 1;
        double sum = 0;
        while(i <= x) {
            sum += 1 / i;
            i++;
        }

        System.out.println(sum);
    }
}
