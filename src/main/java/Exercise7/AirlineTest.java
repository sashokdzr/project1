package Exercise7;
import java.util.Scanner;
public class AirlineTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Airline init = new Airline();
        for (int j=1; j<=20; j++) {
            for (int t=0; t<init.arr.length-1; t++){
                System.out.println("Seat "+ (t+1) +": " + init.arr[t]);
            }
            System.out.println("Select class 1 or 2");
            init.setAirclass(input.nextInt());
            if (init.getAirclass() == 1) {
                init.checkFirstClass();
            }
            if (init.getAirclass() == 2) {
                init.checkSecondClass();
            }
            if (Airline.count1+ Airline.count2 ==2){
                System.out.println("Next flight leaves in 3 hours.");
            }
        }
    }
}
