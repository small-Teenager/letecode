package algorithm.array;

/**
 * 31. 下一个排列
 * 
 * @author search yaodong199@icloud.com
 */
public class NextPermutation_31 {

	public void nextPermutation(int[] nums) {
		if (nums == null || nums.length < 2)
			return;
		int prev = nums.length - 2;
		while (prev > -1 && nums[prev] >= nums[prev + 1])
			prev--;
		if (prev > -1) {
			int i = nums.length - 1;
			while (nums[i] <= nums[prev])
				i--;
			swap(nums, i, prev);
		}
		int start = Math.max(0, prev + 1);
		int end = nums.length - 1;
		while (start < end)
			swap(nums, start++, end--);
		return;
	}

	private static void swap(int[] nums, int l, int r) {
		int tmp = nums[l];
		nums[l] = nums[r];
		nums[r] = tmp;
	}
}
