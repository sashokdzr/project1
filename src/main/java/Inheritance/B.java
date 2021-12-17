package Inheritance;

public class B extends A {
    int b;
    public B(int variable1, String variable2, int a, int b) {
        super(variable1, variable2, a);
        this.b = b;
    }

    @Override
    public String toString() {
        return "B{" +
                "variable1=" + variable1 +
                ", variable2='" + variable2 + '\'' +
                ", a=" + a +
                ", b=" + b +
                '}';
    }
}
