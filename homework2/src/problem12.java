import java.util.Locale;
import java.util.Scanner;

public class problem12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Input the first number : ");
        float num1 = scan.nextFloat();
        System.out.println("Input the second number : ");
        float num2 = scan.nextFloat();
        System.out.println("Input the operator : ");
        String operator = scan.next();
        if (operator.equals("+")) {
            System.out.println(num1 + " " +  operator + " " + num2 + " = " + (num1 + num2));
        } else if (operator.equals("-")) {
            System.out.println(num1 + " " + operator + " " + num2 + " = " + (num1 - num2));

        } else if (operator.equals("*")) {
            System.out.println(num1 + " " + operator + " " + num2 + " = " + (num1 * num2));
        } else if (operator.equals("/")) {
            if (num2 != 0)
                System.out.println(num1 + " " + operator  + " " + num2  + " = " + (num1 / num2));
            else
                System.out.println("Can't divide by zero");
        } else {
            System.out.println("Input correct operator");
        }
    }
}
