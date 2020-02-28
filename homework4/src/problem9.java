import java.util.Locale;
import java.util.Scanner;

public class problem9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Input an integer: ");
        int num = scan.nextInt();
        int i = 1;
        int factorial = 1;
        while(i <= num) {
            factorial *= i;
            i++;
        }
        System.out.println(num + " !  = " + factorial);
    }
}
