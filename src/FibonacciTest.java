import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;


public class FibonacciTest {
    @Test
    public void testFirstTen() {
        int[] expected = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        assertArrayEquals(expected, Fibonacci.getFirstTen());
    }
}
