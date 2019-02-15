
package problems.algorithm.math;

/**
 * Excel 表序列号171
 * 
 * @author search yaodong199@icloud.com
 */
public class TitleToNumber_171 {

	public int titleToNumber(String s) {
		int n = s.length();
		if (n == 1)
			return s.charAt(0) - 'A' + 1;
		int[] alpha = new int[26];
		for (int i = 0; i < 26; i++) {
			alpha[i] = i + 1;
		}
		int ans = 0;
		int c = 1;
		for (int i = n - 1; i >= 0; i--) {
			ans += alpha[s.charAt(i) - 'A'] * c;
			c *= 26;
		}
		return ans;
	}
}
