import java.util.Locale;
import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Input an integer: ");
        int k = scan.nextInt();
        System.out.println("Input a string: ");
        String str = scan.next();
        int lenght = str.length();
        if (k > lenght){
            System.out.println("Out of stings length");
        }else {
            System.out.println(str.charAt(k));
        }
    }
}
