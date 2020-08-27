package Exercise7;
import java.util.Scanner;
import java.security.SecureRandom;
public class Task9 {
    public static void main(String[] args) {
int[][] t = new int[2][3];
Scanner input = new Scanner(System.in);
SecureRandom random = new SecureRandom();

for (int i=0; i<t.length; i++ ) {
    System.out.print(t[i][1]);
}
        System.out.println();
for (int k=0; k<t.length; k++){
    for (int j=0; j<t[k].length; j++){
        t[k][j] = random.nextInt(100);
    }
}
        int min = t[1][1];
    for (int k=0; k<t.length; k++){
        for (int j=0; j<t[k].length; j++){
            if (t[k][j]<min){
                min = t[k][j];
            }
        }
    }
        System.out.println("Min value = "+ min);
    int sum = 0;
    for (int k=0; k<t.length; k++){
        sum += t[k][2];
    }
        System.out.println("Sum = "+sum);
        System.out.println("Index"+"   "+"Value");
        for (int i=0; i<t.length; i++){
            for (int j=0; j<t[i].length; j++){
                System.out.println("R:"+i+" C:"+j+"   "+t[i][j]);
            }
        }
    }

}
