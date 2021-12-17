package other;

public class Switchimplemention {
    public void result( int i) {
        switch (i) {
            case 0:
                System.out.println(String.format("0"));
            break;
            case 1:
            case 2:
                System.out.println(String.format("1-2"));
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(String.format("2-5"));
                break;
            default:
                System.out.println(String.format("Out of range"));
        }
    }
    public int generator(){
        int j = (int) (Math.round(Math.random()*10));
        return j;
    }
}
