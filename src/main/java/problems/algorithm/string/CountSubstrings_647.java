package problems.algorithm.string;

/**
 * @author search
 * @version ����ʱ�䣺2018��5��6�� ����3:48:25 ��˵��
 */
public class CountSubstrings_647 {

	public int countSubstrings(String s) {
		int outer = 0;
		for (int i = 0; i < s.length(); i++) {
			String str = s.charAt(i) + "";
			// if (isPalindrome(str)) {
			// outer++;
			// }
			outer++;
			for (int j = i + 1; j < s.length(); j++) {
				str += s.charAt(j);
				if (isPalindrome(str)) {
					outer++;
				}
			}
		}
		return outer;

	}

	public boolean isPalindrome(String s) {
		if ("".equals(s)) {
			return true;
		}

		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}
}
