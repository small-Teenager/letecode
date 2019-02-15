package problems.algorithm.string;

/**
 * 686. �ظ������ַ���ƥ��
 * 
 * @author search yaodong199@icloud.com
 */
public class RepeatedStringMatch_686 {

	/**
	 * B �Ƿ�ΪA �ظ����Ӻ���Ӵ�
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
