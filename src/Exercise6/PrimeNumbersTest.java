package Exercise6;

import java.util.Scanner;

public class PrimeNumbersTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PrimeNumbers main = new PrimeNumbers();
        System.out.println("Input a number: ");
        int num = input.nextInt();
        int count = 0;
        for (int i = 1; i <=num; i++) {
            if (main.prime(i) == 0) {
                count += 1;
            }
        }
        System.out.println("Prime numbers: "+count);
    }
}
