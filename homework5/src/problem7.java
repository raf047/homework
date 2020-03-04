import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class problem7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Input size of array: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        int[] arrReverse = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Input element" + i + " : ");
            int c = scan.nextInt();
            arr[i] = c;
        }

        for (int i = 0; i < n; i++) {
            arrReverse[i] = arr[n - i - 1];
        }
        System.out.println(Arrays.toString(arrReverse));
    }
}
