
import java.util.*;

public class Question_22 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Emter a number :");
        int num = sc.nextInt();
        int square = num * num;
        int sum = 0;
        while (square > 0) {
            sum = sum + square % 10;
            square = square / 10;
        }
        if (sum == num) {
            System.err.println("Neon number");
        } else {
            System.err.println("Not Neon number");

        }
    }
}
