import java.util.Locale;
import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Please input integer number : ");
        int num = scan.nextInt();
        if (num == 0){
            System.out.println("number is 0");
        }else if (num * (-1) > 0){
            System.out.println(" negative ");
        }else {
            System.out.println(" positive ");
        }
    }
}
