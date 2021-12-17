package Inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ATest {
A a = new A(1,"1",1);
    @Test
    public void add() {
        int actual = 4;
        int expected = a.add(2);
        assertEquals(actual, expected);
    }
}