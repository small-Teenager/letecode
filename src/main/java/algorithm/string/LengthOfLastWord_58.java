package algorithm.string;

/**
 * @author search
 * @version ����ʱ�䣺2018��4��23�� ����4:59:37 ��˵�� : ���һ�����ʵĳ���
 */
public class LengthOfLastWord_58 {
	
	public int lengthOfLastWord(String s) {
		String[] arr = s.trim().split(" ");
		return arr[arr.length - 1].length();
	}

	public int lengthOfLastWord2(String s) {
		int count = 0;
		if (s.length() == 0)
			return 0;
		s = s.trim();
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) != ' ')
				count++;
			else
				break;
		}
		return count;
	}
}
