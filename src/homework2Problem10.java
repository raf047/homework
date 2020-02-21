import java.util.Locale;
import java.util.Scanner;

public class homework2Problem10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Please input 3 integer numbers...");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int max;
        String oldest;
        if (num1 > num2) {
            max = num1;
            oldest = "first";
        } else {
            max = num2;
            oldest = "second";
        }
        if (max < num3) {
            max = num3;
            oldest = "third";
        }

        int min;
        String youngest;
        if (num1 < num2) {
            min = num1;
            youngest = "first";
        } else {
            min = num2;
            youngest = "second";
        }
        if (min > num3) {
            min = num3;
            youngest = "third";
        }

        System.out.println("oldest among them is " + oldest + " : " + max + "y");
        System.out.println("youngest among them is " + youngest + " : " + min + "y");

    }
}
