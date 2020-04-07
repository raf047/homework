import java.util.Scanner;
import java.util.Locale;
public class problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Please input 4 integer numbers...");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int num4 = scan.nextInt();
        if (num1 == num2 && num1 == num3 && num1 == num4)
            System.out.println("equal");
        else
            System.out.println("not equal");
    }
}
