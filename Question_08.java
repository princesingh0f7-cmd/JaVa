
import java.util.*;

public class Question_08 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a First number :");
        int num1 = sc.nextInt();
        System.out.print("Enter a Second number :");
        int num2 = sc.nextInt();
        System.out.println("Enter a operator (+, - , * , / & %)");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println("sum : " + (num1 + num2));
                break;
            case '-':
                System.out.println("substract : " + (num1 - num2));
                //Subtraction (-): You cannot subtract from a string inside println() like that.

                break;
            case '*':
                System.out.println("multiplication  : " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Division : " + (num1 / num2));
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            case '%':
                if (num2 != 0) {
                    System.out.println("Remainder : " + (num1 % num2));
                } else {
                    System.out.println("Cannot find remainder with zero.");
                }
                break;
            default: {
                System.out.print("Enter wrong operator.");
            }

        }
    }
}
