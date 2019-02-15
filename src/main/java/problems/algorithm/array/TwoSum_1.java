package problems.algorithm.array;

/**
 * @author search
 * @version 创建时间：2018年4月23日 下午3:38:58 类说明 :两数之和
 */
public class TwoSum_1 {
	// bruteforc
	public int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] == target - nums[i]) {
					return new int[] { i, j };
				}
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}
}
