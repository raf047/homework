import java.util.Locale;
import java.util.Scanner;

public class problem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Please input 5 integer numbers...");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int num4 = scan.nextInt();
        int num5 = scan.nextInt();

        if (num1 > num2) {
            int num = num1;
            num1 = num2;
            num2 = num;
        }

        if (num1 > num3) {
            int num = num1;
            num1 = num3;
            num3 = num;
        }
        if (num2 > num3) {
            int num = num2;
            num2 = num3;
            num3 = num;
        }

        if (num1 > num4) {
            int num = num1;
            num1 = num4;
            num4 = num;
        }
        if (num2 > num4) {
            int num = num2;
            num2 = num4;
            num4 = num;
        }
        if (num3 > num4) {
            int num = num3;
            num3 = num4;
            num4 = num;
        }

        if (num1 > num5) {
            int num = num1;
            num1 = num5;
            num5 = num;
        }
        if (num2 > num5) {
            int num = num2;
            num2 = num5;
            num5 = num;
        }
        if (num3 > num5) {
            int num = num3;
            num3 = num5;
            num5 = num;
        }
        if (num4 > num5) {
            int num = num4;
            num4 = num5;
            num5 = num;
        }

        System.out.println(num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5);
    }

}
