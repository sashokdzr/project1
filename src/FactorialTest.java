import java.util.Scanner;
public class FactorialTest {
    public static void main(String[] args) {
        Factorial test = new Factorial();
        Scanner s = new Scanner(System.in);
        System.out.print("Input factorial: ");
        long n=s.nextLong();
        System.out.print(test.getResult(n));
    }
}
