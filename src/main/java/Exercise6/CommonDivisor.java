package Exercise6;

public class CommonDivisor {
    static int EuclideanAlgorithm(int a, int b) {
        int t;
        while (b != 0) {
            t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}

