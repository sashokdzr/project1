package Inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class BTest {
    B b =  new B(1, "3",2,1);
    @Test
    public void add() {
        int actual = 3;
        int expected = b.add(b.b);
        assertEquals(actual, expected);
    }

}