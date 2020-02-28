import java.util.Locale;
import java.util.Scanner;

public class problem10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Input an integer: ");
        int num = scan.nextInt();
        int i = 0;
        int j = 1;
        int k = 0;
        for (int p = 2; p < num; p++){
            k = i + j;
            i = j;
            j = k;
        }
        System.out.println(k);
    }
}
// 0 1 1 2 3 5 8 13 21