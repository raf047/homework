import java.util.Locale;
import java.util.Scanner;

public class problem2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Input a string: ");
        String str = "a   asd   asd   asd  a  cvb  ";

        int count = 0;
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == ' '){
                if (str.charAt(i + 1) != ' '){
                    count++;
                }
            }
        }
        if (str.charAt(0) != ' '){
            count++;
        }
        System.out.println(count);
    }
}
