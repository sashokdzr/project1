package Exercise7;

public class Airline {
    static int count1 = 0;
    static int count2 = 0;
    public boolean[] arr = new boolean[11];
    private int airclass = 0;

    public int getAirclass() {
        return airclass;
    }

    public void setAirclass(int airclass) {
        if (airclass == 1 || airclass == 2)
            this.airclass = airclass;
        else {
            System.out.println("Please choose either 1 or 2 class");
        }
    }

    public void checkFirstClass() {
        int i = 0;
        while (arr[i] && i < 5) {
            i++;
        }
        if (i > 4) {
            System.out.println("All seats are busy, please choose the other class");
            count1 = 1;
        } else {
            System.out.println("Your seat is " + (i + 1) + " in " + airclass + " class");
            arr[i] = true;
        }
    }

    public void checkSecondClass() {
        int i = 5;
        while (arr[i] && i < 10) {
            i++;
        }
        if (i > 9) {
            System.out.println("All seats are busy, please choose the other class");
            count2 = 1;
        } else {
            System.out.println("Your seat is " + (i + 1) + " in " + airclass + " class");
            arr[i] = true;
        }
    }
}

