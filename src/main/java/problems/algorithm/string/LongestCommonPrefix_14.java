package problems.algorithm.string;

/**
 * 
 * @author search yaodong199@icloud.com 最长公共前缀
 */
public class LongestCommonPrefix_14 {

	public String longestCommonPrefix(String[] strs) {
		if (strs.length == 1)
			return strs[0];
		if (strs == null || strs.length == 0)
			return "";

		for (int i = 0; i < strs.length; i++) {

		}
		return "";
	}

	// method one
	public String longestCommonPrefix1(String[] strs) {
		if (strs == null || strs.length == 0)
			return "";
		String pre = strs[0];
		int i = 1;
		while (i < strs.length) {
			while (strs[i].indexOf(pre) != 0)
				pre = pre.substring(0, pre.length() - 1);
			i++;
		}
		return pre;
	}

	// method two
	public String longestCommonPrefix2(String[] strs) {
		StringBuilder sb = new StringBuilder();
		char currChar;

		if (strs == null || strs.length == 0)
			return "";

		for (int i = 0; i < strs[0].length(); i++) {
			currChar = strs[0].charAt(i);
			for (String s : strs) {
				if (i >= s.length() || s.charAt(i) != currChar) {
					return sb.toString();
				}
			}
			sb.append(currChar);
		}
		return sb.toString();
	}

}
