package Inheritance;

public class A {
    protected int variable1;
    protected String variable2;
    protected int a;

    public A(int variable1, String variable2, int a) {
        this.variable1 = variable1;
        this.variable2 = variable2;
        this.a = a;
    }


    int add(int a){
        return a+=2;
    }

    @Override
    public String toString() {
        return "A{" +
                "variable1=" + variable1 +
                ", variable2='" + variable2 + '\'' +
                ", a=" + a +
                '}';
    }
}
