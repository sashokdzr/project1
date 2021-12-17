package Exercise8;
import java.util.Scanner;
public class RectangleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rectanlge shape = new Rectanlge();
        double a = input.nextDouble();
        double b = input.nextDouble();
        shape.setLength(a);
        shape.setWidth(b);
        double perim = shape.perimeter();
        double area = shape.area();
        System.out.printf("Rectangle perimeter = %.2f%nRectangle area = %.2f%n",perim,area);
    }
}
