package problems.algorithm.math;

import java.util.HashSet;
import java.util.Set;

/**
 * 202. 快乐数
 * 
 * @author search yaodong199@icloud.com
 */
public class IsHappy_202 {

	/**
	 * 使用一个哈希集来记录发生的每个数字的每个数字平方的总和。 一旦当前总和无法添加到设置，则返回false; 一旦当前总和等于1，则返回true;
	 * 
	 * @param n
	 * @return
	 */
	public boolean isHappy(int n) {
		Set<Integer> inLoop = new HashSet<Integer>();
		// 定义求和,数字值
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
