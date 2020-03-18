import java.util.Locale;
import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Input an integer: ");
        int num = scan.nextInt();
        while (num < 0){
            System.out.println("Input an integer: ");
            num = scan.nextInt();
        }
        System.out.println(countZeros(num));
    }

    public static boolean countZeros(int num){
        int count = 0;
        while (num > 0) {
            if (num % 10 == 0){
                count++;
            }
            num = num / 10;
        }
        if (count % 2 == 0)
            return true;
        else
            return false;

    }
}
