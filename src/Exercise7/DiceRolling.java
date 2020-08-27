package Exercise7;
import java.security.SecureRandom;
public class DiceRolling {
    protected int[] frequency = new int[13];
    SecureRandom random = new SecureRandom();

    public int sum (){
        int dice1 = random.nextInt(6)+1;
        int dice2 = random.nextInt(6)+1;
        return (dice1 + dice2);
    }
    public int[] getFrequency() {
        return frequency;
    }
    public void setFrequency(int[] frequency) {
        this.frequency = frequency;
    }
    public String star(int a){
        String s = "";
        for (int i = 1; i<=a; i++){
            s+="*";
        }
        return(s);
    }
}
