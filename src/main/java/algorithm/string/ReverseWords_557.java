package algorithm.string;
/** 
* @author search 
* @version 创建时间：2018年4月23日 下午4:52:36 
* 类说明 :557. 反转字符串中的单词 III
*/
public class ReverseWords_557 {
	/**
	 * 1.string change to array 
	 * 2.reverse words
	 * @param s
	 * @return
	 */
	public String reverseWords(String s) {
		if ("".equals(s))
			return s;
		String[] str = s.trim().split(" ");
		StringBuilder res=new StringBuilder();
		for (int i = 0; i < str.length; i++) {
			res.append(new StringBuffer(reverseString(str[i]))+" ");
		}

		return res.toString().trim();

	}

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
}
