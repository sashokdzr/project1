package Exercise5;

import java.util.Scanner;

public class PrintingProgram {
    Scanner input = new Scanner(System.in);
    private int[] arr = new int[5];

    private int[] mass() {
        for (int i = 0; i < 5; i++) {
            int number = input.nextInt();
            if (number > 0 && number <= 30) {
                arr[i] = number;
            } else {
                System.out.println("All numbers should be from 1 to 30 (Null by default)");
                arr[i] = 0;
            }
        }
        return arr;
    }

    protected void paint() {
        mass();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < arr[i]; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
