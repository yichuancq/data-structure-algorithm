package fibonacci;

/**
 * @author yichuan
 */
public class Fibonacci {

    /**
     * @param num
     * @return
     */
    public int fibFun(int num) {
        if (num == 1) {
            return num + 1;
        } else {
            return num + fibFun(num - 1);
        }
    }
}
