
public class Question_30 {

    public static void main(String args[]) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) { //part1
                System.out.print("* ");
            }
            for (int k = 1; k <= 2 * (4 - i); k++) { //part 2
                System.out.print("  ");
            }
            for (int m = 1; m <= i; m++) { //part1
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int x = 1; x <= 4; x++) {
            for (int y = 1; y <= 4 - x + 1; y++) {
                System.out.print("* ");
            }
            for (int z = 1; z <= (x - 1) * 2; z++) {
                System.out.print("  ");
            }
            for (int y = 1; y <= 4 - x + 1; y++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
