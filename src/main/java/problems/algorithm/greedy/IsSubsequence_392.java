package problems.algorithm.greedy;

/**
 * 392. 判断子序列
 * 
 * @author search
 *
 */
public class IsSubsequence_392 {

	public boolean isSubsequence(String s, String t) {
		char[] chars = s.toCharArray();
		int index = 0;
		for (int i = 0; i < chars.length; i++) {
			int k = t.indexOf(String.valueOf(chars[i]), index);
			if (k < 0) {
				return false;
			}
			index = k + 1;
		}
		return true;
	}

}
