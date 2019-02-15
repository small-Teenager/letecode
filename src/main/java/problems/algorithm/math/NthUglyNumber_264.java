package problems.algorithm.math;

/**
 * @author Search
 * @data 18:08 2019/1/21
 * 264. 丑数 II
 */
public class NthUglyNumber_264 {
    /**
     * 丑数就是只包含质因数 2, 3, 5 的正整数
     * 找出第 n 个丑数
     *
     * @param n
     * @return
     */
    public int nthUglyNumber(int n) {
        int[] dp = new int[n];
        dp[0] = 1;
        int index2 = 0, index3 = 0, index5 = 0;
        int nextUgly2 = 2, nextUgly3 = 3, nextUgly5 = 5;
        for (int i = 1; i < n; i++) {
            dp[i] = Math.min(Math.min(nextUgly2, nextUgly3), nextUgly5);
            if (dp[i] == nextUgly2) {
                nextUgly2 = 2 * dp[++index2];
            }
            if (dp[i] == nextUgly3) {
                nextUgly3 = 3 * dp[++index3];
            }
            if (dp[i] == nextUgly5) {
                nextUgly5 = 5 * dp[++index5];
            }
        }
        return dp[n - 1];
    }
	
	/**
	* method2
	*
    * @param n
    * @return
    */
    public int nthUglyNumber2(int n) {
        int[] res = new int[n];
        res[0] = 1;
        int t2 = 0, t3 = 0, t5 = 0, index = 1;
        while (index < n) {
            res[index] = Math.min(res[t2] * 2, Math.min(res[t3] * 3, res[t5] * 5));
            t2 += res[index] == res[t2] * 2 ? 1 : 0;
            t3 += res[index] == res[t3] * 3 ? 1 : 0;
            t5 += res[index] == res[t5] * 5 ? 1 : 0;
            ++index;
        }
        return res[n - 1];
    }
}
