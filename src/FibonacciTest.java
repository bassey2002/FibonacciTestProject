import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class FibonacciTest {
    @Test
    public void testFirstTen() {
        int[] expected = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        int[] actual = new int[10];
        actual[0] = 0;
        actual[1] = 1;
        for (int i = 2; i < 10; i++) {
            actual[i] = actual[i - 1] + actual[i - 2];
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(actual[i]);
        }

        assertArrayEquals(expected, actual);
    }
}
