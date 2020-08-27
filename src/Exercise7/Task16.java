package Exercise7;

public class Task16 {
    public static void main(String[] args) {
        double total = 0;
        for (String i:args){
            total += Double.parseDouble(i);
        }
        System.out.println("Sum = " + total);
    }
}
