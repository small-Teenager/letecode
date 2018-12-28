package algorithm.string;
/** 
* @author search 
* @version ����ʱ�䣺2018��4��23�� ����4:50:19 
* ��˵�� :125. ��֤���Ĵ�
*/
public class IsPalindrome_125 {
	/**
	 * 1.get letter number 
	 * 2.change to lower case 
	 * 3.verification the code
	 * @param s
	 * @return
	 */
	public boolean isPalindrome(String s) {
		s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
		StringBuilder sb = new StringBuilder(s);
		return s.equals(sb.reverse().toString());

	}
	
	public boolean isPalindrome2(String s) {
		if (s.equals(""))
			return true;
		s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}
}
