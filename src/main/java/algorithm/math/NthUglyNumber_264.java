package algorithm.math;

/**
 * @author Search
 * @data 18:08 2019/1/21
 * 264. ���� II
 */
public class NthUglyNumber_264 {
    /**
     * ��������ֻ���������� 2, 3, 5 ��������
     * �ҳ��� n ������
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
}
