package problems.algorithm.array;

/**
 * 
 * @author search yaodong199@icloud.com 665. 非递减数列
 */
public class CheckPossibility_665 {
	/**
	 * 非递减数列的： 对于数组中所有的 i (1 <= i < n)，满足 array[i] <= array[i + 1] 即原数列删除一个数
	 * 能否变为递增数列
	 * 
	 * @param nums
	 * @return
	 */
	public boolean checkPossibility(int[] nums) {
		boolean decreasing = false;
		int result = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] > nums[i + 1]) {
				if (decreasing) {
					return false;
				}
				result = i;
				decreasing = true;
			}
		}
		return result == 0 || result == nums.length - 2 || result == nums.length - 1
				|| nums[result - 1] <= nums[result + 1] || nums[result] <= nums[result + 2];
	}

	// 是否为递增
	// 递增数列：nums[i]<=nums[i+1]
	public boolean isPossibility(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] > nums[i] + 1) {
				return false;
			}
		}
		return true;
	}
}
