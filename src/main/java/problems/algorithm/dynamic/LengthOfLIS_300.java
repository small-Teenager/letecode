package problems.algorithm.dynamic;

import java.util.Arrays;

/**
 * 300. 最长上升子序列
 * 
 * @author search
 *
 */
public class LengthOfLIS_300 {

	private int[] memo;

	public int lengthOfLIS(int[] nums) {

		if (nums.length == 0)
			return 0;

		memo = new int[nums.length];
		Arrays.fill(memo, -1);
		int res = 1;
		for (int i = 0; i < nums.length; i++)
			res = Math.max(res, getMaxLength(nums, i));

		return res;
	}

	// 以 nums[index] 为结尾的最长上升子序列的长度
	private int getMaxLength(int[] nums, int index) {

		if (memo[index] != -1)
			return memo[index];

		int res = 1;
		for (int i = 0; i <= index - 1; i++)
			if (nums[index] > nums[i])
				res = Math.max(res, 1 + getMaxLength(nums, i));

		return memo[index] = res;
	}

	// V2 动态规划
	public int lengthOfLISV2(int[] nums) {

		if (nums.length == 0)
			return 0;

		// memo[i] 表示以 nums[i] 为结尾的最长上升子序列的长度
		int memo[] = new int[nums.length];
		Arrays.fill(memo, 1);
		for (int i = 1; i < nums.length; i++)
			for (int j = 0; j < i; j++)
				if (nums[i] > nums[j])
					memo[i] = Math.max(memo[i], 1 + memo[j]);

		int res = memo[0];
		for (int i = 1; i < nums.length; i++)
			res = Math.max(res, memo[i]);

		return res;
	}

	public static void main(String[] args) {

		int nums1[] = { 10, 9, 2, 5, 3, 7, 101, 18 };
		System.out.println((new LengthOfLIS_300()).lengthOfLIS(nums1));
		// 4

		// ---

		int nums2[] = { 4, 10, 4, 3, 8, 9 };
		System.out.println((new LengthOfLIS_300()).lengthOfLIS(nums2));
		// 3

		// ---

		int nums3[] = { 2, 2 };
		System.out.println((new LengthOfLIS_300()).lengthOfLIS(nums3));
		// 1

		// ---

		int nums4[] = { 1, 3, 6, 7, 9, 4, 10, 5, 6 };
		System.out.println((new LengthOfLIS_300()).lengthOfLIS(nums4));
		// 6
	}
}
