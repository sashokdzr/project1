package Exercise7;

public class VariableLength {
    public int product (int ... num){
        int prod = 1;
        for (int i:num){
            prod *=i;
        }
        return (prod);
    }
}
