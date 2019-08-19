package problems.algorithm.hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Search yaodong199@ciloud.com 单词规律
 *
 */
public class WordPattern_290 {

	public boolean wordPattern(String pattern, String str) {
		char[] chars = pattern.toCharArray();
		char[] strs = str.toCharArray();

		Map<Character, String> map = new HashMap<>();
		int step = 0, i = 0;
		for (i = 0; i < chars.length && step < strs.length; i++) {
			String target = map.get(chars[i]);
			StringBuilder sb = new StringBuilder();
			while (step <= strs.length - 1) {
				char c = strs[step];
				step += 1;
				if (c == ' ') {
					break;
				}
				sb.append(c);
			}
			String result = sb.toString();

			if (target == null) {
				if (map.containsValue(result)) {
					return false;
				}
				map.put(chars[i], result);
			} else if (!target.equals(result)) {
				return false;
			}
		}
		if (step != strs.length || i != chars.length) {
			return false;
		}
		return true;
	}

}
