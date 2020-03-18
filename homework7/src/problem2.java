import java.util.Locale;
import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Input first integer: ");
        int a = scan.nextInt();
        System.out.println("Input first integer: ");
        int b = scan.nextInt();
        System.out.println(calculatePercentage(a, b));
    }

    public static int calculatePercentage(int a, int b){
        return 100*(b - a)/a;
    }
}

