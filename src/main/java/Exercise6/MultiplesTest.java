package Exercise6;
import java.security.SecureRandom;
import java.util.Scanner;
public class MultiplesTest {
    public static void main(String[] args) {
        SecureRandom generate = new SecureRandom();
        Scanner input = new Scanner(System.in);
        Multiples obj = new Multiples();
        int statistic = input.nextInt();
        int e = 0;
        int f=0;
        double procent;
        for (int i =1; i<=statistic; i++) {
            int k = generate.nextInt(99) + 2;
            int t = generate.nextInt(100) + 1;
            boolean res = obj.isMultiple(k, t);
            System.out.println("Number1 = " + k + " Number2 = " + t + " Result = " + res);
            if (res==true){
                e++;
            }
            else {
                f++;
            }
        }
        System.out.println("True = "+ e + " False = " + f);
        procent = (e*10000/statistic);
        System.out.print("True procent is ");
        System.out.println(procent/100);
    }

}
