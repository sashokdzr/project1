package Exercise6;

public class TempConv {
    static double celsius(double far) {
        double t = (5.0 / 9.0) * (far - 32);
        return (t);
    }

    static double fahrenheit(double cel) {
        double t = (9.0 / 5.0) * cel + 32;
        return (t);
    }

}

