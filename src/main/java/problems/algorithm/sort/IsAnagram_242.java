package problems.algorithm.sort;

import java.util.Arrays;

/**
 * 有效的字母异位词
 * 
 * @author search yaodong199@icloud.com
 */
public class IsAnagram_242 {
	/**
	 * 排序后比较
	 * 
	 * @param s
	 * @param t
	 * @return
	 */
	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		char[] str1 = s.toCharArray();
		char[] str2 = t.toCharArray();
		Arrays.sort(str1);
		Arrays.sort(str2);
		return Arrays.equals(str1, str2);
	}

	/**
	 * hash
	 * 
	 * @param s
	 * @param t
	 * @return
	 */
	public boolean isAnagram2(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		int[] table = new int[26];
		for (int i = 0; i < s.length(); i++) {
			table[s.charAt(i) - 'a']++;
		}
		for (int i = 0; i < t.length(); i++) {
			table[t.charAt(i) - 'a']--;
			if (table[t.charAt(i) - 'a'] < 0) {
				return false;
			}
		}
		return true;
	}
}
