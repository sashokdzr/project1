package Exercise6;
import java.util.Scanner;
public class SquareCharacterTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SquareCharacter res = new SquareCharacter();
        System.out.print("Input char: ");
        char k = input.next().charAt(0);
        System.out.println();
        System.out.print("Input side: ");
        int side = input.nextInt();
        System.out.println();
        res.setFill(k);
        res.paint(side);

    }
}
