import fibonacci.Fibonacci;
import org.junit.Test;

public class FibonacciTest {

    @Test
    public void testFib() {
        Fibonacci fibonacci = new Fibonacci();
        int result = fibonacci.fibFun(100);
        System.out.println(result);
    }
}
