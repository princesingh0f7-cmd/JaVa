
public class Question_29 {

    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("  ");
            }
            if (i == 1 || i == 5) {
                for (int m = 1; m <= 2 * i - 1; m++) {
                    System.out.print("* ");
                }
            } else {
                System.out.print("* ");
                for (int k = 1; k <= 2 * i - 3; k++) {
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
