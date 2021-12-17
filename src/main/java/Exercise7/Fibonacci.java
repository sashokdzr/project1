package Exercise7;

public class Fibonacci {
    public int[] fibonacci(int number, int first, int second) {
        int[] mass = new int[number];
        mass[0] = first;
        mass[1] = second;
        for (int i = 2; i < mass.length; i++) {
            mass[i] = mass[i - 1] + mass[i - 2];
        }
        return (mass);
    }

}
