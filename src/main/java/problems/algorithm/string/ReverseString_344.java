package problems.algorithm.string;

/**
 * @author search
 * @version ����ʱ�䣺2018��4��23�� ����4:54:36 ��˵�� :344. ��ת�ַ���
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

	//v2 ����λ��
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
