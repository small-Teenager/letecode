package problems.algorithm.string;

/**
 * @author search
 * @version 创建时间：2018年4月23日 下午4:54:36 类说明 :344. 反转字符串
 */
public class ReverseString_344 {

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

	//v2 交换位置
	public void reverseString(char[] s) {
		if (s.length <= 1) {
			return;
		}
		int i = 0, j = s.length - 1;
		while (i < j) {
			char c = s[i];
			s[i++] = s[j];
			s[j--] = c;
		}
	}
}
