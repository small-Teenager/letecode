package problems.algorithm.string;

/**
 * 重复的子字符串
 * 
 * @author search yaodong199@icloud.com
 */
public class RepeatedSubstringPattern_459 {

	/**
	 * 有一个问题 a是不是a的子串
	 * 
	 * @param s
	 * @return
	 */
	public boolean repeatedSubstringPattern(String s) {
		String sub = null;
		int start = 0, end = 0, howManyTime = 0;
		for (int i = s.length() / 2; i >= 1; i--) {
			if (s.length() % i != 0)
				continue;
			start = 0;
			end = i;
			sub = s.substring(start, end);
			howManyTime = s.length() / sub.length();
			boolean isRepeatedSubString = true;
			for (int t = 1; t <= howManyTime; t++) {
				if (!s.substring(start, end).equals(sub)) {
					isRepeatedSubString = !isRepeatedSubString;
					break;
				}
				start += i;
				end += i;
			}
			if (isRepeatedSubString)
				return isRepeatedSubString;
		}
		return false;
	}

}
