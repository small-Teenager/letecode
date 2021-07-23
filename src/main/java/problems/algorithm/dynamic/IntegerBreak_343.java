package problems.algorithm.dynamic;

import java.util.Arrays;

/**
 * 343. 整数拆分
 * 
 * @author search
 *
 */
public class IntegerBreak_343 {

	// V1 暴力破解
	public int integerBreak(int n) {

		if (n < 1)
			throw new IllegalArgumentException("n should be greater than zero");
		return breakInteger(n);
	}

	// 将n进行分割(至少分割两部分), 可以获得的最大乘积
	private int breakInteger(int n) {

		if (n == 1)
			return 1;

		int res = -1;
		for (int i = 1; i <= n - 1; i++)
			res = max3(res, i * (n - i), i * breakInteger(n - i));
		return res;
	}

	private int max3(int a, int b, int c) {
		return Math.max(a, Math.max(b, c));
	}

	private int[] memo;

	// v2 记忆话搜索
	public int integerBreakv2(int n) {

		if (n < 1)
			throw new IllegalArgumentException("n should be greater than zero");

		memo = new int[n + 1];
		Arrays.fill(memo, -1);

		return breakIntegerv2(n);
	}

	// 将n进行分割(至少分割两部分), 可以获得的最大乘积
	private int breakIntegerv2(int n) {

		if (n == 1)
			return 1;

		if (memo[n] != -1)
			return memo[n];

		int res = -1;
		for (int i = 1; i <= n - 1; i++)
			res = max3(res, i * (n - i), i * breakInteger(n - i));
		memo[n] = res;
		return res;
	}

	// v3 动态规划
	public int integerBreakv3(int n) {

		if (n < 1)
			throw new IllegalArgumentException("n should be greater than zero");

		int[] memo = new int[n + 1];
		memo[1] = 1;
		for (int i = 2; i <= n; i++)
			// 求解memo[i]
			for (int j = 1; j <= i - 1; j++)
				memo[i] = max3(memo[i], j * (i - j), j * memo[i - j]);

		return memo[n];
	}

}
