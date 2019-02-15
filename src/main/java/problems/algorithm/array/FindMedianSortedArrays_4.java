package problems.algorithm.array;

import java.util.Arrays;

/**
 * 两个排序数组的中位数
 * @author search
 * yaodong199@icloud.com
 */
public class FindMedianSortedArrays_4 {

	/**
	 * 将两个数组合并为一个数组
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		//合并数组
		int[] nums = new int[nums1.length + nums2.length];
		for (int i = 0; i < nums1.length; i++) {
			nums[i] = nums1[i];
		}
		for (int i = 0; i < nums2.length; i++) {
			nums[nums1.length + i] = nums2[i];
		}
		Arrays.sort(nums);
		
		//如果新数组长度为偶数 中位数：nums[nums.length / 2] + nums[nums.length / 2 - 1]
		if (nums == null || nums.length == 0)
			return 0.0;
		
		if (nums.length % 2 == 0) {
			return (nums[nums.length / 2] + nums[nums.length / 2 - 1]) / 2.0;
		}
		
       //新数组的长度为奇数，中位数： nums[nums.length / 2]
		return nums[nums.length / 2];
	}
}
