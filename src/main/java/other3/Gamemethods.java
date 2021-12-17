package other3;

import java.security.SecureRandom;

public class Gamemethods {

    public int[] newSet(int[] arraySet, int generatedValue) {
        int i;
        int j;
        //int generatedValue = generateCard();
        /** Find element in array with value generatedValue **/
        for (i = 0; i < arraySet.length; i++) {
            if (arraySet[i] == generatedValue) {
                break;
            }
        }
        /** Displacement of array and reduce the array length **/
        int[] arr2 = new int[arraySet.length - 1];
        for (j = 0; j < i; j++) {
            arr2[j] = arraySet[j];
        }
        for (j = i; j < arraySet.length - 1; j++) {
            arr2[j] = arraySet[j + 1];
        }
        return arr2;
    }

//    public void printArray(int[] arr) {
//        System.out.println("Print array:");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//    }

    public int generateCard() {
        int result = 0;
        SecureRandom secureRandom = new SecureRandom();
        int card = secureRandom.nextInt(10) + 2;
        while (card == 5)
            card = secureRandom.nextInt(10) + 2;
        return card;

    }
    public int winOrNot(int sum){
        if (sum <= 21)
            return sum;
        else return 0;
    }

}
