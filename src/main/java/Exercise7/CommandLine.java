package Exercise7;

public class CommandLine {
    public static void main(String[] args) {
        int length = 10;
        int first = 0;
        int increase = 0;
        if (args.length == 3) {
            length = Integer.parseInt(args[0]);
            first = Integer.parseInt(args[1]);
            increase = Integer.parseInt(args[2]);
        }
        if (args.length == 2) {
            first = Integer.parseInt(args[0]);
            increase = Integer.parseInt(args[1]);
/*            args[2] = args [1];
            args[1] = args[0];
            args[0]  = "10";
            length = Integer.parseInt(args[0]);
 */
        }
        System.out.println();
        System.out.print("values:" + length + first + increase);
    }
}
