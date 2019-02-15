package problems.algorithm.string;

/**
 * 551. 学生出勤纪录 I 有2个以上的连续迟到才会被处罚，且缺勤小于2
 * 
 * @author search yaodong199@icloud.com
 */
public class CheckRecord_551 {

	/**
	 * method 1
	 * 
	 * @param s
	 * @return
	 */
	public boolean checkRecord(String s) {
		int countAbs = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'A') {
				countAbs++;
				if (countAbs > 1) {
					return false;
				}
			}
			if (s.charAt(i) == 'L') {
				if (i + 2 < s.length()) {
					if (s.charAt(i + 1) == 'L' && s.charAt(i + 2) == 'L') {
						return false;
					}
				}
			}
		}
		return true;
	}

	/**
	 * method 2
	 * 
	 * @param s
	 * @return
	 */
	public boolean checkRecord2(String s) {
		int A = 0;
		if (s.startsWith("A"))
			A++;
		int count = 1;
		for (int i = 1; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == s.charAt(i - 1)) {
				{
					count++;
				}
				if ((ch == 'L' && count > 2) || (ch == 'A' && count > 1)) {
					return false;
				}
			} else {
				count = 1;
			}
			if (ch == 'A') {
				A++;
			}
		}
		if (A > 1) {
			return false;
		}
		return true;
	}

	/**
	 * method 3
	 * 
	 * @param s
	 * @return
	 */
	public boolean checkRecord3(String s) {
		int absentCount = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'A')
				absentCount++;
			if (absentCount > 1)
				return false;
		}
		// 是否存在2个以上连续的迟到
		return absentCount < 2 && s.indexOf("LLL") < 0;
	}
}
