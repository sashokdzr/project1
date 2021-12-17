package Codewars;

public class Exercise1 {
    public static void main(String[] args) {
        Exercise1 exercise1 = new Exercise1();
        int[] arr = exercise1.generateRange(2,10,2);
        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public int[] generateRange(int min, int max, int step){
        int[] arr = new int[max/2];
        for (int j=0; j<arr.length; j++){
            for (int i=min; i<=max; i+=step){
                arr[j] = i;
            }
        }
        return arr;
    }
}
