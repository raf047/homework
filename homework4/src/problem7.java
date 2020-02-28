import java.util.Locale;
import java.util.Scanner;

public class problem7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Input an integer: ");
        int x = scan.nextInt();
        if (x % 2 == 0){
            System.out.println(-x / 2);
        }else {
            System.out.println(x / 2 + 1);
        }
    }
}
