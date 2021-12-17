package Inheritance;

public class ABDemo {
    public static void main(String[] args) {
        A a = new A(1, "Class A", 1);
        B b = new B(2, "Class B", 2, 3);
        System.out.println(a);
        System.out.println(b);
        b.b = (b.add(b.b));
        System.out.println(b);
    }
}
