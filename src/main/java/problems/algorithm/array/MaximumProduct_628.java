package problems.algorithm.array;

import java.util.Arrays;

/**
 * @author search
 * @version 创建时间：2018年4月23日 下午4:22:50 类说明 628. 三个数的最大乘积
 */
public class MaximumProduct_628 {
	public int maximumProduct(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;
		else if (nums.length == 1)
			return nums[0];
		else if (nums.length == 2)
			return nums[0] * nums[1];
		else if (nums.length == 3)
			return nums[0] * nums[1] * nums[2];
		Arrays.sort(nums);
		return Math.max(nums[0] * nums[1] * nums[nums.length - 1],
				nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]);
	}
}
