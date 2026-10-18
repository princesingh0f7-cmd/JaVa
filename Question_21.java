
import java.util.*;

public class Question_21 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Emter a number :");
        int num = sc.nextInt();
        int sum = 0;
        int orgi = num;
        while (num > 0) {
            int digit = num % 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }
            sum = sum + fact;
            num = num / 10;
        }
        if (orgi == sum) {
            System.out.println("Number is strong number");
        } else {
            System.out.println("Number is not strong number");

        }
    }
}
