package problems.algorithm.array;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author search yaodong199@icloud.com
 * 数组的度 697 ：即可以理解为数组中 最大的众数
 */
public class FindShortestSubArray_697 {
	/**
	 * 遍历数组 map存储 key代表nums值 value代表出现次数
	 * 
	 * @param nums
	 * @return
	 */
	public int findShortestSubArray(int[] nums) {
		Map<Integer, Integer> left = new HashMap<>();
		Map<Integer, Integer> right = new HashMap<>();
		Map<Integer, Integer> count = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int x = nums[i];
			if (left.get(x) == null)
				left.put(x, i);
			right.put(x, i);
			count.put(x, count.getOrDefault(x, 0) + 1);
		}

		int ans = nums.length;
		int degree = Collections.max(count.values());
		for (int x : count.keySet()) {
			if (count.get(x) == degree) {
				ans = Math.min(ans, right.get(x) - left.get(x) + 1);
			}
		}
		return ans;
	}
}
