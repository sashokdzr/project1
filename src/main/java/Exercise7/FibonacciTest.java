package Exercise7;

import java.util.Scanner;

public class FibonacciTest {
    public static void main(String[] args) {
        Fibonacci init = new Fibonacci();
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int first = input.nextInt();
        int second = input.nextInt();
        int[] mass = init.fibonacci(number, first, second);
        for (int i : mass) {
            System.out.print(i + " ");
        }

    }
}
