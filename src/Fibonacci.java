public class Fibonacci {
    public static int[] getFirstTen() {
        int[] fib = new int[10];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < 10; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }
}
