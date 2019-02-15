package problems.algorithm.math;
/**
 * @author Search
 * @data 17:02 2019/1/22
 * 排列硬币 441
 */
public class ArrangeCoins_441 {

    /**
     * 可以看成等差数列
     * 等差数列求和公式  n = (1 + x) * x / 2  x = (-1 + sqrt(8 * n + 1)) / 2
     *
     * @param n
     * @return
     */
    public int arrangeCoins(int n) {
        return (int) (-1 + Math.sqrt(1 + (long) n << 3)) >> 1;
    }
}


