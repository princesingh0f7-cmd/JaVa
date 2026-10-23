
public class Question_34 {

    public static void main(String args[]) {

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print((char) ('E' - j + 1) + " ");
            }

            System.out.println();
        }
    }
}
