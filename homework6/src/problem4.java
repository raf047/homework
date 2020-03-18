import java.util.Locale;
import java.util.Scanner;

public class problem4  {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Input first string: ");
        String str = scan.next();
        System.out.println("Input number of rotations: ");
        int num = scan.nextInt();
        int lenght = str.length();
        num = num % lenght;
        char[] arr = str.toCharArray();
        for (int i = 0; i < num; i++){
            char[] newArr = new char[lenght];
            for (int j = 0, k = 1; j < lenght - 1 ; j++, k++) {
                newArr[j] = arr[k];
            }
            newArr[lenght - 1] = arr[0];
            arr = newArr;
        }
            System.out.println(arr);

    }
}
