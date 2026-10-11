
import java.util.*;

public class Question_15 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int even = 0;
        int odd = 0;
        System.out.print("Enter how many integer :");
        int loop = sc.nextInt();
        for (int i = 1; i <= loop; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                even += num;
            } else {
                odd += num;
            }
        }
        System.out.println("Sum of odd : " + odd);
        System.out.print("Sum of even : " + even);

    }
}
