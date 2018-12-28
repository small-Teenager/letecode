package algorithm.string;

/**
 * 859. 亲密字符串
 * 
 * @author search yaodong199@icloud.com
 */
public class BuddyStrings_859 {
	/**
	 * 字符串a、b长度必须相等，只能交换两个字符
	 * @param A
	 * @param B
	 * @return
	 */
	public boolean buddyStrings(String A, String B) {
		if (A.length() != B.length())
			return false;
		if (A.equals(B)) {
			int[] count = new int[26];
			for (int i = 0; i < A.length(); ++i)
				count[A.charAt(i) - 'a']++;

			for (int c : count)
				if (c > 1)
					return true;
			return false;
		} else {
			int first = -1, second = -1;
			for (int i = 0; i < A.length(); ++i) {
				if (A.charAt(i) != B.charAt(i)) {
					if (first == -1)
						first = i;
					else if (second == -1)
						second = i;
					else
						return false;
				}
			}

			return (second != -1 && A.charAt(first) == B.charAt(second) && A.charAt(second) == B.charAt(first));
		}
	}
}
