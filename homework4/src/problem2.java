import java.util.Locale;
import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
//        method 1
        System.out.println(20 * (20 + 1) / 2);
//        method 2

        int i = 1;
        int sum = 0;
        while(i <= 20) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
