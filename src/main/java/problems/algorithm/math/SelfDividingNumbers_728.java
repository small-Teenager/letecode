package problems.algorithm.math;

import java.util.ArrayList;
import java.util.List;

/**
 * 728. 自除数
 * 类似于从m-n之间的素数
 * @author search yaodong199@icloud.com
 */
public class SelfDividingNumbers_728 {

	/**
	 * 输出从left 到right 的所有自除数 
	 * 自除数 是指可以被它包含的每一位数除尽的数
	 * @param left
	 * @param right
	 * @return
	 */

	public List<Integer> selfDividingNumbers2(int left, int right) {

		List<Integer> res = new ArrayList<Integer>();

		for (int i = left; i <= right; i++) {

			int currentDigit = i;

			while (currentDigit >= 0) {
				if (currentDigit == 0) {
					res.add(i);
					break;
				}
				if (currentDigit % 10 == 0)
					break;
				if (i % (currentDigit % 10) == 0)
					currentDigit /= 10;
				else
					break;
			}
		}

		return res;
	}

	public List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> res = new ArrayList<>();
		for (int n = left; n <= right; ++n) {
			if (selfDividing(n))
				res.add(n);
		}
		return res;
	}

	public boolean selfDividing(int n) {
		for (char c : String.valueOf(n).toCharArray()) {
			if (c == '0' || (n % (c - '0') > 0))
				return false;
		}
		return true;
	}

	public static void main(String args[]) {
		SelfDividingNumbers_728 a = new SelfDividingNumbers_728();
		System.out.println(a.selfDividingNumbers(1, 7).toString());
	}
}
