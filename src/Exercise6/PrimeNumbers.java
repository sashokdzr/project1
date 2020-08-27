package Exercise6;

public class PrimeNumbers {

    protected int prime(int num) {
        int k = 0;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                k += 1;
            }
        }
        return (k);
    }
}
