import java.util.Scanner;

public class FindTheLargestNumber {
    public static int[] getUserInput() {
        int[] userInputArr = new int[10];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < userInputArr.length; i++) {
            System.out.println("Enter the next value for comparision: ");
            int userInput = s.nextInt();
            userInputArr[i] = userInput;
        }
        return userInputArr;
    }

    public static void calculateMaxNum(int[] userInputArr) {
        int result = 0;
        for (int j = 0; j < userInputArr.length - 1; j++) {
            if (result < userInputArr[j])
                result = userInputArr[j];
        }
        System.out.printf("Max number is: %d", result);
    }
}