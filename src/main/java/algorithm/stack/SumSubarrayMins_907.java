package algorithm.stack;

import java.util.Stack;

/**
 * @author Search
 * 子数组的最小值之和 907
 * @date 2019/1/11
 */
public class SumSubarrayMins_907 {
    /**
     * 求一个数组的所有子数组
     * 子数组的所有的最小值之和
     */

    public int sumSubarrayMins(int[] A) {
        int MOD = 1_000_000_007;
        Stack<RepInteger> stack = new Stack();
        int ans = 0, dot = 0;
        for (int j = 0; j < A.length; ++j) {
            // Add all answers for subarrays [i, j], i <= j
            int count = 1;
            while (!stack.isEmpty() && stack.peek().val >= A[j]) {
                RepInteger node = stack.pop();
                count += node.count;
                dot -= node.val * node.count;
            }
            stack.push(new RepInteger(A[j], count));
            dot += A[j] * count;
            ans += dot;
            ans %= MOD;
        }
        return ans;
    }
}

class RepInteger {
    int val, count;

    RepInteger(int v, int c) {
        val = v;
        count = c;
    }
}