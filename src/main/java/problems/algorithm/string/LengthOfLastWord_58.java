package problems.algorithm.string;

/**
 * @author search
 * @version 创建时间：2018年4月23日 下午4:59:37 类说明 : 最后一个单词的长度
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
