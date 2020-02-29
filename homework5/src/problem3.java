import java.util.Locale;
import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Input size of array: ");
        int n = scan.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Input element" + i + " : ");
            String text = scan.next();
            arr[i] = text;
        }

        System.out.println("Input string: ");
        String string = scan.next();
        boolean s = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(string)){
                System.out.print("Strings index is " + i + " ( " + arr[i] + ")" );
                s = false;
                break;
            }
        }
        if (s){
            System.out.print("Not found");
        }

    }
}
