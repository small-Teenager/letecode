package problems.algorithm.array;

/**
 * @author search
 * @version 创建时间：2018年4月23日 下午4:24:57 类说明 :最大连续1的个数
 */
public class FindMaxConsecutiveOnes_485 {
	public int findMaxConsecutiveOnes(int[] nums) {
		int max = 0;
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				count++;
				max = Math.max(max, count);
			} else {
				count = 0;
			}
		}

		return max;
	}
}
