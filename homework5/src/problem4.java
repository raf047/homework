import java.util.Locale;
import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Input size of array: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Input element" + i + " : ");
            int num = scan.nextInt();
            arr[i] = num;
        }


        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
            if (i == arr.length - 1){
                System.out.print(arr2[i]);
            }else {
                System.out.print(arr2[i] + ", ");
            }
        }


    }
}
