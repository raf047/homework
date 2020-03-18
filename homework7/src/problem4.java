import java.util.Locale;
import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        String[] arr = new String[]{"abc", "def", "qw7", "12"};
//        System.out.println(reversedIndex(arr));
        String[] revArr = reversedIndex(arr);
        for (int i = 0; i < revArr.length; i++) {
            System.out.println(revArr[i]);
        }
    }

    public static String[] reversedIndex(String[] arr){
        String[] reverseArr = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            char[] str = arr[i].toCharArray();
            int lenght = str.length;
            for (int j = 0; j < lenght / 2; j++){
                char temp = str[j];
                str[j] = str[lenght - j - 1];
                str[lenght - j - 1] = temp;
            }
            String reverse = new String(str);
            reverseArr[i] = reverse;
        }
        return reverseArr;
    }
}

