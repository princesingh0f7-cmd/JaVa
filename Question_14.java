
import java.util.*;

public class Question_14 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter a number : ");
        int num = sc.nextInt();
        boolean isprime = true;
        if (num < 2) {
            System.out.println("Number is not prime number");
            return;
        }
        if (num == 2) {
            System.out.println("Number is prime number");
        } else {
            for (int i = 2; i <= num - 1; i++) { // under root num for optimisation Math.sqrt(num)
                if (num % i == 0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime == true) {
                System.out.println("Number is prime number");
            } else {
                System.out.println("Number is not prime number");

            }
        }

    }
}
