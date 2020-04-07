import java.util.Locale;
import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Input the first number :");
        int num1 = scan.nextInt();
        System.out.println("Input the second number :");
        int num2 = scan.nextInt();
        System.out.println("Input the third  number :");
        int num3 = scan.nextInt();
        if ((num1 + num2) == num3)
            System.out.println("The result is: true");
        else
            System.out.println("The result is: false");
    }
}
