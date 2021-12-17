package Exercise7;
public class SalesComissionsTest {
    public static void main(String[] args) {
        SalesComissions init = new SalesComissions();
        init.newarr();
        System.out.println();
        init.display();
        System.out.println();
        System.out.println("prem = " + init.prem(9200));
        System.out.println("rounded = " + init.rounded(init.prem(9200)));
        for (int i = 0 ; i< init.arr.length; i++){
            ++ init.frequency[init.rounded(init.prem(init.arr[i]))];
        }
        for (int j=2 ; j< init.frequency.length; j++){
            String s = init.stars(init.frequency[j]);
            System.out.print("prem "+ j +"00"+"-"+j+"99" +"$" + " " + s);
            System.out.println();
        }
    }
}
