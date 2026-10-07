
import java.util.*;

public class Question_03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a price of pencil: ");
        float pencil = sc.nextFloat();
        System.out.println("Enter a price of pen: ");
        float pen = sc.nextFloat();
        System.out.println("Enter a price of eraser: ");
        float eraser = sc.nextFloat();
        float final_price = pen + pencil + eraser;
        float gst = final_price + final_price * 0.18f;
        System.out.println("Total price of item pencil,pen & eraser : " + final_price);
        System.out.print("Finall price after +18%gst: " + gst);
    }
}
