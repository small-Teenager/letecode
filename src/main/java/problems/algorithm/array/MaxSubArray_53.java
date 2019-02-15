package problems.algorithm.array;

/**
 * @author search
 * @version ����ʱ�䣺2018��4��23�� ����5:36:33 ��˵�� :��������
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
