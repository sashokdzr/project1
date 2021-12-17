package Exercise6;

public class Exponentiation {
    static int integerPower(int b, int e){
    int i=1;
    int k;
    k=b;
    if (e==0) {
        return (1);
    }
    else {

        while (i < e) {
            b *= k;
            i++;
        }
        return (b);
    }
}
}
