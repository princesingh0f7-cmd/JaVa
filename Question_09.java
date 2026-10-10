
import java.util.Scanner;

public class Question_09 {

    public void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.print("Positive number");
        } else {
            System.out.print("Negative number");

        }
    }
}
