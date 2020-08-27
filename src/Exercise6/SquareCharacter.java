package Exercise6;
public class SquareCharacter {
    private char fill;
    protected void paint(int side){
        for (int i =1; i<=side; i++ ){
            System.out.println();
            for (int j=1; j<=side; j++){
                System.out.print(fill);
            }
        }
    }

    public char getFill() {
        return fill;
    }

    public void setFill(char fill) {
        this.fill = fill;
    }
}
