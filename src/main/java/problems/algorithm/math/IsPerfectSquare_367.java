package problems.algorithm.math;
/**
 * @author Search
 * @data 9:06 2019/1/24
 * 鏈夋晥鐨勫畬鍏ㄥ钩鏂规暟 367
 */
public class IsPerfectSquare_367 {
    /**
     * 瀹屽叏骞冲嚒鏁版槸鍓峮涓繛缁鏁扮殑鍜�
     * 浣跨敤绛夊樊鏁板垪鐨勬眰鍜�
     */

    /**
     * 鐗涢】 浜屽垎
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
