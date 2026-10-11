
import java.util.*;

public class Question_16 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter a num : ");
        int num = sc.nextInt();
        int fac = 1;
        for (int i = 1; i <= num; i++) {
            fac *= i;
        }
        System.out.print("Factorial of " + num + " is " + fac);
    }
}
