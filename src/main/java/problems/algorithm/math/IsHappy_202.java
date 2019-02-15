package problems.algorithm.math;

import java.util.HashSet;
import java.util.Set;

/**
 * 202. ������
 * 
 * @author search yaodong199@icloud.com
 */
public class IsHappy_202 {

	/**
	 * ʹ��һ����ϣ������¼������ÿ�����ֵ�ÿ������ƽ�����ܺ͡� һ����ǰ�ܺ��޷���ӵ����ã��򷵻�false; һ����ǰ�ܺ͵���1���򷵻�true;
	 * 
	 * @param n
	 * @return
	 */
	public boolean isHappy(int n) {
		Set<Integer> inLoop = new HashSet<Integer>();
		// �������,����ֵ
		int sum, number;
		while (inLoop.add(n)) {
			sum = 0;
			while (n > 0) {
				number = n % 10;
				sum += number * number;
				n /= 10;
			}
			if (sum == 1)
				return true;
			else
				n = sum;

		}
		return false;

	}
}
