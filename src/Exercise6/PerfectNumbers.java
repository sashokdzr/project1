package Exercise6;

public class PerfectNumbers {
    static void perfect (long a){
        long sum =0;
        for (long i = 1; i<a; i++){
            if (a%i == 0){
                sum+=i;
            }
        }
        if (sum == a){
            System.out.println("Perfect number " + a);
        }
    }
}
