
import java.util.*;

public class Question_20 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int square = num * num;
        int l = 0;
        int temp = num;
        while (num > 0) {
            num = num / 10;
            l++;
        }
        int digit = square % (int) Math.pow(10, l);
        if (digit == temp) {
            System.out.println("Number is automorphic number ");
        } else {
            System.out.println("Number is not automorphic number ");

        }
    }
}
