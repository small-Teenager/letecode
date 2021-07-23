package problems.algorithm.math;

/**
 * 172. 阶乘后的零
 * 
 * @author search yaodong199@icloud.com
 */
public class TrailingZeroes_172 {

	public int trailingZeroes(int n) {
		int numOfFives = 0;
		while (true) {
			if (n / 5 < 1) {
				break;
			} else {
				numOfFives += n / 5;
				n = n / 5;
			}
		}
		return numOfFives;
	}

	public int trailingZeroes2(int n) {
		int counter = 0;
		while (n >= 5) {
			n /= 5;
			counter += n;
		}
		return counter;
	}
}
