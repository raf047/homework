import java.util.Locale;
import java.util.Scanner;

public class problem8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Input an integer: ");
        int x = scan.nextInt();
        int i = 1;
        while(i < x) {
            if (i % 2 == 0){
                System.out.print(i + " - ");

            }else {
                System.out.print(i + " + ");
            }
            i++;
        }
        if (x % 2 == 0){
            System.out.println(x + " = " + (-x / 2));
        }else {
            System.out.println(x + " = " + (x / 2 + 1));
        }
    }
}
