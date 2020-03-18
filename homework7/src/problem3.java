import java.util.Locale;
import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Input first integer: ");
        int num = scan.nextInt();
        int[] arr = new int[]{75, 54, 8, -3, 2, 8, 67};
        System.out.println(getIndex(num, arr));
    }

    public static int getIndex(int num, int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num)
                return i;
        }
        return -1;
    }
}

