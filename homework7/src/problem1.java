import java.util.Locale;
import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Input an integer: ");
        int num = scan.nextInt();
        while (num < 0){
            System.out.println("Input an integer: ");
            num = scan.nextInt();
        }
        System.out.println(sumOfDigits(num));
    }

    public static int sumOfDigits(int num){
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }
}
