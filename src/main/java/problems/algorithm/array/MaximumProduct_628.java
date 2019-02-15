package problems.algorithm.array;

import java.util.Arrays;

/**
 * @author search
 * @version ����ʱ�䣺2018��4��23�� ����4:22:50 ��˵�� 628. �����������˻�
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
