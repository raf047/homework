import java.util.Locale;
import java.util.Scanner;

public class problem10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        int[] arr = new int[]{4, 5, 7, 47, 9, 7, 6};
        int k = 2;

        for (int j = 0; j < arr.length; j++) {
            int occur = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[j] == arr[i]) {
                    occur++;
                }
            }
            if (k == occur) {
                System.out.println(arr[j]);
            }
        }


    }
}
