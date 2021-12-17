package Exercise6;
import java.util.Scanner;
public class CommonDivisorTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int res = CommonDivisor.EuclideanAlgorithm(a,b);
        System.out.println(res);
    }
}
