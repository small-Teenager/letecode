package algorithm.string;
/** 
* @author search 
* @version ����ʱ�䣺2018��4��23�� ����5:17:49 
* ��˵�� :�ַ����еĵ�һ��Ψһ�ַ�
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
