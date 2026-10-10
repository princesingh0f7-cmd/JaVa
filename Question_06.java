
import java.util.*;

public class Question_06 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a First Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter a Second Number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter a Third Number: ");
        int num3 = sc.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println("First number is greater then other two number.");
        } else if (num2 > num3) {
            System.out.println("Second number is greater then other two number.");
        } else {
            System.out.println("Third number is greater then other two number.");

        }
    }
}
