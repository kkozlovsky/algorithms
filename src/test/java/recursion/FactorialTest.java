package recursion;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void recursiveFactorial() {
        assertEquals(Factorial.recursiveFactorial(4), 24);

    }

    @Test
    public void iterativeFactorial() {
        assertEquals(Factorial.iterativeFactorial(4), 24);
    }
}