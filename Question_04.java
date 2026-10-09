
import java.util.Scanner;

public class Question_04 {

    static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check (odd/even) : ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }
    }
}
