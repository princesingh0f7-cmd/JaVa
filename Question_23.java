
import java.util.Scanner;

public class Question_23 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a rows : ");
        int row = sc.nextInt();
        System.out.print("Enter a columns : ");
        int columns = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
