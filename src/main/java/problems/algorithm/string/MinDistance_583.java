package problems.algorithm.string;

/**
 * 583. 两个字符串的删除操作
 * 
 * @author search yaodong199@icloud.com
 */
public class MinDistance_583 {

	/**
	 * 求2个字符串的交集∩ s1.length+s2.length-2*∩.length
	 */
	public int minDistance(String s1, String s2) {
		int[][] memo = new int[s1.length() + 1][s2.length() + 1];
		return s1.length() + s2.length() - 2 * lcs(s1, s2, s1.length(), s2.length(), memo);
	}

	// 交集的长度
	public int lcs(String s1, String s2, int m, int n, int[][] memo) {
		if (m == 0 || n == 0)
			return 0;
		if (memo[m][n] > 0)
			return memo[m][n];
		if (s1.charAt(m - 1) == s2.charAt(n - 1))
			memo[m][n] = 1 + lcs(s1, s2, m - 1, n - 1, memo);
		else
			memo[m][n] = Math.max(lcs(s1, s2, m, n - 1, memo), lcs(s1, s2, m - 1, n, memo));
		return memo[m][n];
	}
}
