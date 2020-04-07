import java.util.Locale;
import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
            System.out.println("Input seconds: ");
            int seconds = scan.nextInt();
            int hour = seconds / 3600;
            int minute = (seconds - hour * 3600) / 60;
            seconds = seconds - hour * 3600 - minute * 60;
            System.out.println(hour + ":"+ minute + ":" + seconds);
    }
}
