package Exercise7;
import java.security.SecureRandom;
public class Task8 {
    public static void main(String[] args) {
        int[] array = new int[10];
        float [] arr = new float[100];
        SecureRandom random = new SecureRandom();
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%s", array[i]);
        }
            System.out.printf("%nElement 6: %s%n", array[5]);

            for (int i = 0; i < array.length; i++) {
                array[i] = 8;
            }
            for (int i = 0; i < array.length; i++) {
                System.out.printf("%s", array[i]);
            }
        System.out.println();
            for (int k=0; k<arr.length; k++){
                arr[k]= random.nextFloat();
            }
        float total = 0;
            for (int t=0; t<arr.length;t++ ){
                total+=arr[t];
            }
        System.out.printf("%s",total);
            int [] arr1 = {9, 8, 7, 6, 5, 4, 3, 2, 1,7,1,2,3,4,5,6,7,8,9,0};
            int [] arr2 = new int[34];
            System.arraycopy(arr1, 0, arr2 , 0 , 11);
        System.out.println();
            for (int numbers: arr2){
                System.out.print(numbers);
            }
            float min = arr[0];
            float max = arr[0];
            for (float count: arr){
                if (count < min){
                    min = count;
                }
                if (count>max){
                    max = count;
                }
            }
        System.out.printf("%nMinimum value: %f",min);
        System.out.printf("%nMaximum value: %f",max);

        }

}
