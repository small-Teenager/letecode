package algorithm.math;
/**
 * @author Search
 * @data 17:00 2019/1/24
 * 3的幂 326
 */
public class IsPowerOfThree_326 {

    /**
     * 3的幂
     * 以3为底取对数结果 =log(n)/log(3)一定为整数
     * @param n
     * @return
     */
    static public boolean isPowerOfThree(int n) {
        double num = Math.log(n) / Math.log(3);
        if (num - (int) num == 0) {
            return true;
        }
        if (num - (int) num >= 0.99999999999999) {
            return true;
            //0.9999999999999991
        }
        return false;
    }

}
