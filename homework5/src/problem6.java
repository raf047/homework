import java.util.Locale;
import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Input size of array: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Input element" + i + " : ");
            int c = scan.nextInt();
            arr[i] = c;
        }

        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max > arr[i]){
                max = arr[i];
            }
            if (min < arr[i]){
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);

    }
}
