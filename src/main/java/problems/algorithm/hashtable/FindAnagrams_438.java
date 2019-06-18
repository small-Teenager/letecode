package problems.algorithm.hashtable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author Search yaodong199@ciloud.com 找到字符串中所有字母异位词
 */
public class FindAnagrams_438 {

	public List<Integer> findAnagrams(String s, String p) {

		List<Integer> res = new ArrayList<>();
		if (s.equals("") || p.equals("") || s.length() < p.length())
			return res;
		int len = p.length();
		int start = 0, end = len - 1;
		int a[] = new int[26];
		int b[] = new int[26];
		for (char c : p.toCharArray()) {
			b[c - 'a']++;
		}
		for (int i = start; i <= end; i++) {
			a[s.charAt(i) - 'a']++;
		}
		if (Arrays.equals(a, b))
			res.add(0);
		for (int i = 1; i < s.length() - len + 1; i++) {
			a[s.charAt(i - 1) - 'a']--;
			a[s.charAt(i + len - 1) - 'a']++;
			if (Arrays.equals(a, b))
				res.add(i);
		}
		return res;
	}

}
