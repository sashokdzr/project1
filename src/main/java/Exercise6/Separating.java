package Exercise6;

public class Separating {
    static double separatint(double k) {
        return Math.floor(k);
    }

    static double separatrem(double k) {
        return (k - Separating.separatint(k));
    }
    static void spaces(int integ) {
        int m = 0;
        while (integ > 0) {
            int a = integ % 10;
            integ = (int) Separating.separatint(integ / 10);
            m = m * 10 + a;
        }
        while (m > 0) {
            int k = m % 10;
            System.out.print(k + "  ");
            m = (int) Math.floor(m / 10);

        }
    }
}
