package algorithm.math;
/**
 * @author Search
 * @data 9:06 2019/1/24
 * 有效的完全平方数 367
 */
public class IsPerfectSquare_367 {
    /**
     * 完全平凡数是前n个连续奇数的和
     * 使用等差数列的求和
     */

    /**
     * 牛顿 二分
     *
     * @param num
     * @return
     */
    public boolean isPerfectSquare(int num) {
        if (num < 1) {
            return false;
        }
        if (num == 1) {
            return true;
        }
        long l = 1, r = num / 2;
        long mid, midSq;
        while (l <= r) {
            mid = (l + r) / 2;
            midSq = mid * mid;
            if (midSq == num) return true;
            if (midSq < num) l = mid + 1;
            else r = mid - 1;
        }
        return false;
    }
}
