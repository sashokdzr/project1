package Exercise7;

public class DiceRollingTest {
    public static void main(String[] args) {
        DiceRolling init = new DiceRolling();
        int cycle = 36000000;
        for (int i = 1; i<=cycle; i++){
            ++init.frequency[init.sum()];
        }
        for (int i=1; i < init.frequency.length; i++){
            System.out.print("value :"+ i + " " + init.frequency[i]);
            System.out.println();
        }
    }
}
