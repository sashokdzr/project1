public class TrianglePrinting {
    public void triangle1() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void triangle2(){
        for (int i=1; i<=10; i++){
            for (int j=10; j>=i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void triangle3(){
        for (int i=1; i<=10; i++){
            for (int j=1; j<=10; j++){
                if (j<=i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    public void triangle4(){
        for (int i=1; i<=10; i++){
            for (int j=10; j>=1; j--){
                if (j>=i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
