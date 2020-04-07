import java.util.Locale;
import java.util.Scanner;

public class problem10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Please input 3 integer numbers...");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int max;
        String youngest;
        if (num1 > num2) {
            max = num1;
            youngest = "first";
        } else {
            max = num2;
            youngest = "second";
        }
        if (max < num3) {
            max = num3;
            youngest = "third";
        }

        System.out.println("youngest among them is " + youngest + " : " + max + "y");

    }
}
