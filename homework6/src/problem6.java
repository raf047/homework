import java.util.Locale;
import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Input a string: ");
        String str = scan.next();

        int lenght = str.length();
        int count = 0;
        for (int i = 0; i < lenght; i++) {
            if (str.charAt(i) == '('){
               count++;
            }
            if (str.charAt(i) == ')'){
                count--;
            }
            if (count < 0){
                break;
            }
        }

        if (count == 0){
            System.out.println("valid");
        }else {
            System.out.println("invalid");
        }
    }
}