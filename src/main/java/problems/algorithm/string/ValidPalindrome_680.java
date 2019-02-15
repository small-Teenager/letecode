package problems.algorithm.string;

/**
 * ��֤�����ַ��� ��
 * 
 * @author search
 *
 */
public class ValidPalindrome_680 {
	//�����뵽���Ǳ����ƽ�  ��ÿɾ��һ���ַ���֤һ��
	public boolean validPalindrome(String s) {
		int l = 0, r = s.length() - 1;
		for (; l < r; l++, r--)
			if (s.charAt(l) != s.charAt(r))
				return isPalindrome(s, l + 1, r) || isPalindrome(s, l, r - 1);
		return true;
	}

	private boolean isPalindrome(String s, int l, int r) {
		for (; l < r; l++, r--)
			if (s.charAt(l) != s.charAt(r))
				return false;
		return true;
	}
}
