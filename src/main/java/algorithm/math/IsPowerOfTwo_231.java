package algorithm.math;

/**
 * @author Search
 * @date 2019/1/9
 * 2的幂 231
 */
public class IsPowerOfTwo_231 {

    /**
     * & 与
     * @param n
     * @return
     */
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        } else if ((n & n - 1) == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * math method
     * b=log2(n)-->转成log10为底
     * b==int
     * @param n
     * @return
     */
    public boolean isPowerOfTwo2(int n) {
        //if n is power of two, then log(n)/log(2) = 0;
        double  res = Math.log10(n)/Math.log10(2);
        double ceilNum  = Math.ceil(res);
        return ceilNum - res ==0;
    }

}
