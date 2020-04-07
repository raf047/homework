import java.util.Locale;
import java.util.Scanner;

public class problem8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Please input mark : ");
        int mark = scan.nextInt();
        if (mark >= 80)
            System.out.println("A");
        else if (mark < 80 && mark >= 60)
            System.out.println(" B ");
        else if (mark < 60 && mark >= 50)
            System.out.println(" C ");
        else if (mark < 50 && mark >= 45)
            System.out.println(" D ");
        else if (mark < 45 && mark >= 25)
            System.out.println(" E ");
        else {
            System.out.println(" F ");
        }

    }
}
