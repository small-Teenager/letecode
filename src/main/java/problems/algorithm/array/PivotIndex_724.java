package problems.algorithm.array;

/**
 * 724.寻找数组的中心索引
 * 
 * @author search yaodong199@icloud.com
 *
 */
public class PivotIndex_724 {
	/**
	 * 数组左侧- 索引= 数组右侧
	 * 
	 * @param nums
	 * @return
	 */
	public int pivotIndex(int[] nums) {
		if (nums.length == 0)
			return -1;
		int sum = 0, leftsum = 0;
		for (int x : nums)
			sum += x;
		for (int i = 0; i < nums.length; i++) {
			if (leftsum == sum - leftsum - nums[i])
				return i;
			leftsum += nums[i];
		}
		return -1;
	}
}