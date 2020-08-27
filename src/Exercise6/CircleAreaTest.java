package Exercise6;
import java.util.Scanner;
public class CircleAreaTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input radius");
        double r = input.nextInt();
        System.out.println("Circle Area = " + CircleArea.area(r));
    }

}
