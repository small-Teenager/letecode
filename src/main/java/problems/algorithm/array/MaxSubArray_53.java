package problems.algorithm.array;

/**
 * @author search
 * @version 创建时间：2018年4月23日 下午5:36:33 类说明 :最大子序和
 */
public class MaxSubArray_53 {

	public int maxSubArray(int[] nums) {
		if (nums.length == 0)
			return Integer.MIN_VALUE;
		int sum = nums[0], best = nums[0];
		for (int k = 1; k < nums.length; k++) {
			sum = Math.max(nums[k], sum + nums[k]);
			best = Math.max(best, sum);
		}
		return best;
	}
}
