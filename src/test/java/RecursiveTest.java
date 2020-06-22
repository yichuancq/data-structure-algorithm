import org.junit.Test;
import recursivefunction.RecursiveFunction;

public class RecursiveTest {
    private RecursiveFunction recursiveFunction = new RecursiveFunction();

    @Test
    public void testRecursive() {

//        int sum1 = recursiveFunction.function(10);
//        System.out.println(sum1);

        int sum2 = recursiveFunction.fact(10);
        System.out.println(sum2);

    }
}
