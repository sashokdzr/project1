import java.util.Scanner;

class SmallestValue {
    private Scanner s = new Scanner(System.in);
    private int firstValue;
    SmallestValue(int firstValue) {
        this.firstValue = firstValue;
    }
    int[] enter(int firstValue) {
        this.firstValue = firstValue;
        int[] arr = new int[firstValue];
        for (int i = 0; i < firstValue; i++) {
            System.out.printf("Input values #%d %n", i+1);
            int value = s.nextInt();
            arr[i] = value;
        }
        return arr;
    }
    int smallest(int[] arr) {
        int smallest = arr[0];
        for (int i = 0; i < firstValue; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }
    int getFirstValue() {
        return firstValue;
    }
}