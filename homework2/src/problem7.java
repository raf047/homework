import java.util.Locale;
import java.util.Scanner;

public class problem7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Please input 3 integer numbers...");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        if (num1 > num2 && num2 > num3)
            System.out.println("increasing");
        else if (num1 < num2 && num2 < num3)
            System.out.println("decreasing");
        else
            System.out.println("Neither increasing or decreasing order");
    }
}
