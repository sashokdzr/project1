package Exercise6;
import java.util.Scanner;
public class MinimumTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input three value (through the Enter)");
        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();
        System.out.println("The minimum: "+Minimum.minim(a,b,c));
    }
}
