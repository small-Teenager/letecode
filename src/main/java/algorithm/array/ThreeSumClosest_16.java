package algorithm.array;

import java.util.Arrays;

/**
 * 最接近的3数之和
 * 
 * @author search yaodong199@icloud.com
 */
public class ThreeSumClosest_16 {

	public int threeSumClosest(int[] num, int target) {
		if (num == null || num.length < 3)
			return 0;
		int res = num[0] + num[1] + num[num.length - 1];
		Arrays.sort(num);
		for (int i = 0; i < num.length - 2; i++) {
			int start = i + 1, end = num.length - 1;
			while (start < end) {
				int sum = num[i] + num[start] + num[end];
				if (sum > target) {
					end--;
				} else {
					start++;
				}
				if (Math.abs(sum - target) < Math.abs(res - target)) {
					res = sum;
				}
			}
		}
		return res;
	}
}
