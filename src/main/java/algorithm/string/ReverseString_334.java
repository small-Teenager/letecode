package algorithm.string;

/**
 * @author search
 * @version 创建时间：2018年4月23日 下午4:54:36 类说明 :344. 反转字符串
 */
public class ReverseString_334 {

	public String reverseString(String s) {
		if (s == null)
			return null;
		if ("".equals(s))
			return "";
		StringBuilder sb = new StringBuilder();
		for (int i = s.length(); i > 0; i--) {
			sb.append(s.charAt(i - 1));
		}
		return sb.toString();
	}

	public String reverseString2(String s) {
		char[] word = s.toCharArray();
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			char temp = word[i];
			word[i] = word[j];
			word[j] = temp;
			i++;
			j--;
		}
		return new String(word);
	}
}
