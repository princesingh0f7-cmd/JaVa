
import java.util.*;

public class Question_13 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter a number : ");
        int num = sc.nextInt();
        while (num > 0) {
            int lastdigit = num % 10;
            System.out.print(lastdigit);
            num /= 10;
        }
    }
}
