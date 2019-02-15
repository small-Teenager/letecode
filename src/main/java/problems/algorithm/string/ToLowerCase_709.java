package problems.algorithm.string;

/**
 * 709. 转换成小写字母
 * 
 * @author search yaodong199@icloud.com
 */
public class ToLowerCase_709 {

	/**
	 * method 1
	 * 实现函数 ToLowerCase()
	 * @param str
	 * @return
	 */
	public String toLowerCase(String str) {
		int len = str.length();
		char[] c = str.toCharArray();
		for (int i = 0; i < len; i++) {
			if ((c[i] <= 'Z') && (c[i] >= 'A')) {
				c[i] = (char) (str.charAt(i) + 32);
			}
		}
		return new String(c);
	}
	
	/**
	 * method 2
	 * @param str
	 * @return
	 */
	 public String toLowerCase2(String str) {
	        StringBuilder sb = new StringBuilder();
	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);
	            if (c >= 'A' && c <= 'Z')   c = (char)(c - 'A' + 'a');
	            sb.append(c);
	        }
	        return sb.toString();
	    }
}
