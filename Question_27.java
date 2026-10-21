
public class Question_27 {

    public static void main(String args[]) {
        for (int i = 1; i <= 4; i++) { //for rows
            for (int j = 1; j <= 6; j++) //for col
            {
                if (i == 1 || i == 4) {
                    System.out.print("* ");
                } else {
                    if (j == 1 || j == 6) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
