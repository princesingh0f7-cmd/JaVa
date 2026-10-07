
import java.util.Scanner;

public class Question_01 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number: ");
        int a = sc.nextInt();
        System.out.println("Enter Second number: ");
        int b = sc.nextInt();
        System.out.println("Enter Third number: ");
        int c = sc.nextInt();
        System.out.println("Average of number first,second & third is: " + (a + b + c) / 3);
    }

}
