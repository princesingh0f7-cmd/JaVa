
public class Question_19 {

    public static void main(String args[]) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // Space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //Star
            for (int k = 1; k <= n; k++) {
                System.err.print(" * ");
            }
            System.out.println();
        }
    }
}
