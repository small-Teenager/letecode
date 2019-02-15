package problems.algorithm.string;

/**
 * 686. 重复叠加字符串匹配
 * 
 * @author search yaodong199@icloud.com
 */
public class RepeatedStringMatch_686 {

	/**
	 * B 是否为A 重复叠加后的子串
	 * @param A
	 * @param B
	 * @return
	 */
	public int repeatedStringMatch(String A, String B) {
		int q = 1;
		StringBuilder sb = new StringBuilder(A);
		for (; sb.length() < B.length(); q++)
			sb.append(A);
		if (sb.indexOf(B) >= 0)
			return q;
		if (sb.append(A).indexOf(B) >= 0)
			return q + 1;
		return -1;
	}
}
