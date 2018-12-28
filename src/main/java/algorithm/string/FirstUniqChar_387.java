package algorithm.string;
/** 
* @author search 
* @version 创建时间：2018年4月23日 下午5:17:49 
* 类说明 :字符串中的第一个唯一字符
*/
public class FirstUniqChar_387 {
	/**
	 * Check the last index and first index of each char
	 * It will return the same value if the char is unique in string
	 * @param s
	 * @return
	 */
    public int firstUniqChar(String s) {
		for (char c : s.toCharArray())
			if (s.lastIndexOf(c) == s.indexOf(c))
				return s.indexOf(c);
		return -1;
	}
}
