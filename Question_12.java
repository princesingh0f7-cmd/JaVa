
import java.util.*;

public class Question_12 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int i = 1;
        int sum = 0;
        while (i <= num) {
            sum += i;
            i++;
        }
        System.out.println("Sum of natural number 1 to " + num + " till : " + sum);
    }
}
