public class Factorial {
    long getResult(long n){
        int res;
        res = 1;
        for (long i=1;i<=n;i++){
            res *=i;
        }
        return res;
    }
}
