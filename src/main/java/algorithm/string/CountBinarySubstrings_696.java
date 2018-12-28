package algorithm.string;

/**
 * 696. �����������Ӵ�
 * 
 * @author search yaodong199@icloud.com
 */
public class CountBinarySubstrings_696 {

	public int countBinarySubstrings(String s) {
		if (s == null || s.length() == 0)
			return 0;
		int[] groups = new int[s.length()];
		int t = 0;
		groups[0] = 1;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i - 1) != s.charAt(i)) {
				groups[++t] = 1;
			} else {
				groups[t]++;
			}
		}

		int ans = 0;
		for (int i = 1; i <= t; i++) {
			ans += Math.min(groups[i - 1], groups[i]);
		}
		return ans;
	}
}
