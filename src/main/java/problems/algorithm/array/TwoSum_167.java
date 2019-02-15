package problems.algorithm.array;

/**
 * 两数之和 II - 输入有序数组
 * 
 * @author search 2018年4月23日 下午3:36:32
 */
public class TwoSum_167 {
	/**
	 * 暴力破解
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
	public int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] == target - nums[i]) {
					return new int[] { i + 1, j + 1 };

				}
				if (nums[i] > target || nums[j] > target) {
					break;
				}
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}
}