import java.util.Locale;
import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Input first integer: ");
        int x = scan.nextInt();
        System.out.println("Input second integer: ");
        int y = scan.nextInt();
        int i = 1;
        int pow = 1;
        while(i <= y) {
            pow *= x;
            i++;
        }

        System.out.println(x + " ^ " + y + " = " + pow);
    }
}
