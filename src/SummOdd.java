public class SummOdd {
    int summ(){
        int result=0;
        for (int i=1; i<=15; i++){
            if (i%2!=0){
                result+=i;
            }
        }
        return result;
    }

}
