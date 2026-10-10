
import java.util.*;

public class Question_11 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year (YYYY) : ");
        int year = sc.nextInt();
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.print("Leap year");
        } else {
            System.out.print("Not Leap year");

        }
    }
}
