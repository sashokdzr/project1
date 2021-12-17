import java.util.Scanner;

public class SmallestValueTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many elements in arr? ");
        SmallestValue test = new SmallestValue(input.nextInt());
        System.out.println();
        int n = test.getFirstValue();
        System.out.printf("Elements in arr = %d%n", n );
        System.out.printf("The smallest value is: %d", test.smallest(test.enter(n)));
    }
}