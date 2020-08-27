package Exercise6;
import java.security.SecureRandom;
import java.util.Scanner;
public class EvenOddTest {
    public static void main(String[] args) {
        System.out.println("Input an integer number ");
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        System.out.println("Is number Even? - " + EvenOdd.isEven(k));
    }
}
