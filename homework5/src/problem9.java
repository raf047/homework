import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class problem9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        int[] arr = new int[]{4, 5, 7, 47, 9, 7, 6};
        int[] arr1 = new int[]{4, 5, 7, 7, 9, 7, 6};

        for (int i = 0; i < arr.length; i++) {
            boolean occur = true;
            for (int j = 0; j < arr1.length; j++) {
                if (arr[i] == arr1[j]){
                    occur = false;
                }
            }
            if (occur) {
                System.out.println(arr[i]);
            }
        }
    }
}
