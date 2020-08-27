package Exercise6;
import java.util.Scanner;
public class SeparatingTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input double value: ");
        double inp = input.nextDouble();
        int integ = (int) Separating.separatint(inp);
        System.out.printf("Integer part : %d%n", integ);
        System.out.printf("Integer remainder : %f%n", Separating.separatrem(inp));
        Separating.spaces(integ);
}

    }

