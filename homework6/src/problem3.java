import java.util.Locale;
import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Input a string: ");
        String str = scan.next();

        boolean palindrome = true;
        int lenght = str.length();
        for (int i = 0; i < lenght / 2; i++) {
            if (str.charAt(i) != str.charAt(lenght - i - 1)){
                palindrome = false;
                break;
            }
        }
        if (palindrome){
            System.out.println("palindrome");
        }else {
            System.out.println("not palindrome");
        }
    }
}
