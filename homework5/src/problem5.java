import java.util.Locale;
import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Input size of array: ");
        int n = scan.nextInt();
        char[] arr = new char[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Input element" + i + " : ");
            char c = scan.next().charAt(0);
            arr[i] = c;
        }

        System.out.println("Input char: ");
        char symbol = scan.next().charAt(0);

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == symbol){
                count++;
            }
        }
        System.out.println(count);

    }
}
