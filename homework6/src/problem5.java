import java.util.Locale;
import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Input first string: ");
        String candidate = scan.next();
        System.out.println("Input second string: ");
        String pattern = scan.next();

        candidate = candidate + candidate;

        boolean found = false;
        for (int i = 0; i <= candidate.length() - pattern.length(); i++) {
            boolean foundThisTime = true;
            for (int j = 0, k = i; j < pattern.length() && k < candidate.length(); j++, k++) {
                if (pattern.charAt(j) != candidate.charAt(k)) {
                    foundThisTime = false;
                    break;
                }
            }
            if (foundThisTime) {
                found = true;
                break;
            }
        }
        if (found){
            System.out.println("Is a rotation");
        }else {
            System.out.println("Is not a rotation");
        }
    }
}



