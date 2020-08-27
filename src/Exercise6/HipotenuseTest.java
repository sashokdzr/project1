package Exercise6;

public class HipotenuseTest {
    public static void main(String[] args) {
        double res = Hipotenuse.hypotenuse(3.0,4.0);
        System.out.println("Hypotenuse with the sides 3.0 and 4.0 equal to "+res);
        res = Hipotenuse.hypotenuse(5.0,12.0);
        System.out.println("Hypotenuse with the sides 5.0 and 12.0 equal to "+res);
        res = Hipotenuse.hypotenuse(8.0,15.0);
        System.out.println("Hypotenuse with the sides 8.0 and 15.0 equal to "+res);
    }
}
