package Exercise6;

import java.util.Scanner;

public class TempConvTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input initial T ( C or c - Celsius , F or f - Fahreinheit)");
        char t = input.next().charAt(0);
        if (t == 'c' || t == 'C') {
            System.out.println("Input T in celsius");
            double cel = input.nextDouble();
            System.out.printf("TF = %.2f%n", TempConv.fahrenheit(cel));
        } else {
            if (t == 'f' || t == 'F') {
                System.out.println("Input T in fahreinheit");
                double far = input.nextDouble();
                System.out.printf("TC = %.2f", TempConv.celsius(far));
            } else
                System.out.println("Error");
        }
    }
}

