package Exercise7;
import java.security.SecureRandom;
public class SalesComissions {
    int length = 1000;
    int[] arr = new int[length];
    int[] frequency = new int[11];
    SecureRandom random = new SecureRandom();
    public void newarr(){
        for (int i = 0; i<arr.length; i++){
            arr[i]= (random.nextInt(99)+1)*100;
        }
    }
    public void display(){
        for (int i=0 ; i<arr.length; i++){
            System.out.print(" "+arr[i]);
        }
    }
    public double prem(int k){
        double res = k*0.09 + 200;
        return (res);
    }
    public int rounded (double res){
        return ((int)Math.floor(res/100));
    }
    public String stars(int f){
        String s ="";
        for (int i=1; i<f; i++){
            s +="*";
        }
        return (s);
    }
    public int[] getArr() {
        return arr;
    }
    public void setArr(int[] arr) {
        this.arr = arr;
    }
}
