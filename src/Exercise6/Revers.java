package Exercise6;

public class Revers {
    static int rever(int num) {
        int m = 0;
        while (num > 0) {
            int a = num % 10;
            num = (int) Math.floor(num/10);
            m = m * 10 + a;
        }
        return (m);
    }
}
