package recursivefunction;

/**
 * 阶乘计算器,递归
 *
 * @author yichuan
 */
public class RecursiveFunction {
    /**
     * 递归
     * 0!=1，n!=(n-1)!×n
     * n!=1×2×3×...×(n-1)×n
     *
     * @return
     */
    public int function(int number) {
        int result = 0;
        if (number == 0) {
            return 1;
        } else if (number >= 1) {
            result = number * function(number - 1);
            System.out.println(number + "!" + "=" + result);
            number--;
        }
        return result;
    }

    /**
     * @param number
     * @return
     */
    public int fact(int number) {
        if (number == 0 || number == 1) {
            return 1;
        } else {
            return number * fact(number - 1);
        }
    }
}
