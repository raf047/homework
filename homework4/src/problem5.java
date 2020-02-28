import java.util.Locale;
import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Input first integer: ");
        int x = scan.nextInt();
        System.out.println("Input second integer: ");
        int y = scan.nextInt();
        while(x <= x + 9) {
            if (x % 9 == 0){
                break;
            }
            x++;
        }

        while (x <= y){
            System.out.print(x + " " );
            x += 9;
        }


    }
}
