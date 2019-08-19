package problems.algorithm.math;
/**
 * @author Search
 * @data 17:02 2019/1/22
 * 鎺掑垪纭竵 441
 */
public class ArrangeCoins_441 {

    /**
     * 鍙互鐪嬫垚绛夊樊鏁板垪
     * 绛夊樊鏁板垪姹傚拰鍏紡  n = (1 + x) * x / 2  x = (-1 + sqrt(8 * n + 1)) / 2
     *
     * @param n
     * @return
     */
    public int arrangeCoins(int n) {
        return (int) (-1 + Math.sqrt(1 + (long) n << 3)) >> 1;
    }
}


