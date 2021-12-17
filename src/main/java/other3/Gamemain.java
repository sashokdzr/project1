package other3;
import java.util.Scanner;
public class Gamemain {
    public static void main(String[] args) {
        int[] initialArray;
        initialArray = new int[]{6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 11, 11, 11, 11};
        Gamemethods gamemethods = new Gamemethods();

        int sum = 0;//first card
        int pullCard = gamemethods.generateCard();
        sum += pullCard;
        System.out.println("Pulled card " + pullCard); // can be removed
        initialArray = gamemethods.newSet(initialArray, pullCard);
        //gamemethods.printArray(arr); // can be removed
        //System.out.println("Array length:"); // can be removed
        //System.out.println(arr.length); // can be removed

        //second card
        pullCard = gamemethods.generateCard();
        sum += pullCard;
        System.out.println("Pulled card " + pullCard); // can be removed
        initialArray = gamemethods.newSet(initialArray, pullCard); // can be removed
        //gamemethods.printArray(arr1);
        //System.out.println("Array length:"); // can be removed
        //System.out.println(arr1.length); // can be removed

        System.out.println("Sum = " + sum);

        /** Read action from user **/
        Scanner scanner = new Scanner(System.in);
        int action = scanner.nextInt();
        initialArray = gamemethods.newSet(initialArray, pullCard);
        if (action == 1) {
            //third card
            pullCard = gamemethods.generateCard();
            sum += pullCard;
            System.out.println("Pulled card " + pullCard); // can be removed
            //gamemethods.printArray(arr2);
            //System.out.println("Array length:"); // can be removed
            //System.out.println(arr1.length); // can be removed
            System.out.println("Sum = " + gamemethods.winOrNot(sum));
        }
        else System.out.println("Enough");

        /** Read action from user **/
        action = scanner.nextInt();
        if (action == 1) {
            //third card
            pullCard = gamemethods.generateCard();
            sum += pullCard;
            System.out.println("Pulled card " + pullCard);
            initialArray = gamemethods.newSet(initialArray, pullCard);
            //gamemethods.printArray(arr3);
            //System.out.println("Array length:"); // can be removed
            //System.out.println(arr2.length); // can be removed
            System.out.println("Sum = " + gamemethods.winOrNot(sum));
        }
        else System.out.println("Enough");


    }
}
