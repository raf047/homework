import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class problem8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Input size of array: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Input element" + i + " : ");
            int c = scan.nextInt();
            arr[i] = c;
        }

        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
