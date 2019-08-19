package problems.algorithm.array;

import java.util.Arrays;

/**
 * @author search
 * @version 创建时间：2018年4月23日 下午5:48:01 类说明 :求众数I
 */
public class MajorityElement_169 {
	/**
	 * 假设众数总是存在
	 * 
	 * @param nums
	 * @return
	 */
	public int majorityElement(int[] nums) {
		Arrays.sort(nums);
		return nums[nums.length / 2];
	}
}
