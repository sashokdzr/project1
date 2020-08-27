public class Interest {
    public static void main(String[] args) {
        double amount;
        double principal = 1000.0;
        System.out.printf("%s%25s%n", "Year", "Amount on deposit");
        for (double rate1=5; rate1<=10; rate1++){
            double rate;
            rate = rate1 / 100;
            System.out.println("Interest equal to "+rate1+ " % ");
            for (int year = 1; year <= 5; ++year){
            //for (int rate=5; rate<=10; rate+=1 ) {

                amount = principal * Math.pow(1.0 + rate, year);
                System.out.printf("%4d%,20.2f%n", year, amount);
           }

        }
    }
}
