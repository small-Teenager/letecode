package problems.algorithm.array;

/**
 * 
 * @author Search yaodong199@icloud.com 209. 长度最小的子数组
 *
 */
public class MinSubArrayLen_209 {

	// v1 暴力破解
	public int minSubArrayLen(int s, int[] nums) {

		if (s <= 0 || nums == null)
			throw new IllegalArgumentException("Illigal Arguments");

		int res = nums.length + 1;
		for (int l = 0; l < nums.length; l++)
			for (int r = l; r < nums.length; r++) {
				int sum = 0;
				for (int i = l; i <= r; i++)
					sum += nums[i];
				if (sum >= s)
					res = Math.min(res, r - l + 1);
			}

		if (res == nums.length + 1)
			return 0;

		return res;
	}

	// v2 优化暴力破解
	public int minSubArrayLenV2(int s, int[] nums) {

		if (s <= 0 || nums == null)
			throw new IllegalArgumentException("Illigal Arguments");

		// sums[i]存放nums[0...i-1]的和
		int[] sums = new int[nums.length + 1];
		sums[0] = 0;
		for (int i = 1; i <= nums.length; i++)
			sums[i] = sums[i - 1] + nums[i - 1];

		int res = nums.length + 1;
		for (int l = 0; l < nums.length; l++)
			for (int r = l; r < nums.length; r++) {
				// 使用sums[r+1] - sums[l] 快速获得nums[l...r]的和
				if (sums[r + 1] - sums[l] >= s)
					res = Math.min(res, r - l + 1);
			}

		if (res == nums.length + 1)
			return 0;

		return res;
	}

	// v3滑动窗口
	public int minSubArrayLenV3(int s, int[] nums) {

		if (s <= 0 || nums == null)
			throw new IllegalArgumentException("Illigal Arguments");

		int l = 0, r = -1; // nums[l...r]为我们的滑动窗口
		int sum = 0;
		int res = nums.length + 1;

		while (l < nums.length) { // 窗口的左边界在数组范围内,则循环继续

			if (r + 1 < nums.length && sum < s)
				sum += nums[++r];
			else // r已经到头 或者 sum >= s
				sum -= nums[l++];

			if (sum >= s)
				res = Math.min(res, r - l + 1);
		}

		if (res == nums.length + 1)
			return 0;
		return res;
	}

	// v4 滑动窗口的另一种实现
	public int minSubArrayLenV4(int s, int[] nums) {

		if (s <= 0 || nums == null)
			throw new IllegalArgumentException("Illigal Arguments");

		int l = 0, r = -1; // [l...r]为我们的窗口
		int sum = 0;
		int res = nums.length + 1;

		while (r + 1 < nums.length) { // 窗口的右边界无法继续扩展了, 则循环继续

			while (r + 1 < nums.length && sum < s)
				sum += nums[++r];

			if (sum >= s)
				res = Math.min(res, r - l + 1);

			while (l < nums.length && sum >= s) {
				sum -= nums[l++];
				if (sum >= s)
					res = Math.min(res, r - l + 1);
			}
		}

		if (res == nums.length + 1)
			return 0;
		return res;
	}

	// v5 二分搜索
	public int minSubArrayLenV5(int s, int[] nums) {

		if (s <= 0 || nums == null)
			throw new IllegalArgumentException("Illigal Arguments");

		// sums[i]存放nums[0...i-1]的和
		int[] sums = new int[nums.length + 1];
		sums[0] = 0;
		for (int i = 1; i <= nums.length; i++)
			sums[i] = sums[i - 1] + nums[i - 1];

		int res = nums.length + 1;
		for (int l = 0; l < nums.length - 1; l++) {
			// Java类库中没有内置的lowerBound方法，
			// 我们需要自己实现一个基于二分搜索的lowerBound:)
			int r = lowerBound(sums, sums[l] + s);
			if (r != sums.length) {
				res = Math.min(res, r - l);
			}
		}

		if (res == nums.length + 1)
			return 0;
		return res;
	}

	// 在有序数组nums中寻找大于等于target的最小值
	// 如果没有（nums数组中所有值都小于target），则返回nums.length
	private int lowerBound(int[] nums, int target) {

		if (nums == null /* || !isSorted(nums) */)
			throw new IllegalArgumentException("Illegal argument nums in lowerBound.");

		int l = 0, r = nums.length; // 在nums[l...r)的范围里寻找解
		while (l != r) {
			int mid = l + (r - l) / 2;
			if (nums[mid] >= target)
				r = mid;
			else
				l = mid + 1;
		}

		return l;
	}

	private boolean isSorted(int[] nums) {
		for (int i = 1; i < nums.length; i++)
			if (nums[i] < nums[i - 1])
				return false;
		return true;
	}

}
