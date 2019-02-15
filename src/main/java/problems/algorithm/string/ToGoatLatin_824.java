package problems.algorithm.string;

import java.util.HashSet;
import java.util.Set;

/**
 * 824. É½ÑòÀ­¶¡ÎÄ
 * @author search
 * yaodong199@icloud.com
 */
public class ToGoatLatin_824 {
	public String toGoatLatin(String S) {
		Set<Character> set = new HashSet<>();
		for (char c : new char[] { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' })
			set.add(c);

		int t = 1;
		StringBuilder sb = new StringBuilder();
		for (String word : S.split(" ")) {
			char first = word.charAt(0);
			if (set.contains(first)) {
				sb.append(word);
			} else {
				sb.append(word.substring(1));
				sb.append(word.substring(0, 1));
			}
			sb.append("ma");
			for (int i = 0; i < t; i++)
				sb.append("a");
			t++;
			sb.append(" ");
		}

		sb.deleteCharAt(sb.length() - 1);
		return sb.toString();
	}
}
