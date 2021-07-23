package problems.algorithm.dynamic;

import java.util.Arrays;

/**
 * 416. 分割等和子集
 * 
 * @author search
 *
 */
public class CanPartition_416 {

	// memo[i][c] 表示使用索引为[0...i]的这些元素,是否可以完全填充一个容量为c的背包
	// -1 表示为未计算; 0 表示不可以填充; 1 表示可以填充
	private int[][] memo;

	// V1 记忆化搜索
	public boolean canPartition(int[] nums) {

		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] <= 0)
				throw new IllegalArgumentException("numbers in nums must be greater than zero.");
			sum += nums[i];
		}

		if (sum % 2 == 1)
			return false;

		memo = new int[nums.length][sum / 2 + 1];
		for (int i = 0; i < nums.length; i++)
			Arrays.fill(memo[i], -1);
		return tryPartition(nums, nums.length - 1, sum / 2);
	}

	// 使用nums[0...index], 是否可以完全填充一个容量为sum的背包
	private boolean tryPartition(int[] nums, int index, int sum) {

		if (sum == 0)
			return true;

		if (sum < 0 || index < 0)
			return false;

		if (memo[index][sum] != -1)
			return memo[index][sum] == 1;

		memo[index][sum] = (tryPartition(nums, index - 1, sum) || tryPartition(nums, index - 1, sum - nums[index])) ? 1
				: 0;

		return memo[index][sum] == 1;
	}

	private static void printBool(boolean res) {
		System.out.println(res ? "True" : "False");
	}

	// V2 动态规划
	public boolean canPartitionv2(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] <= 0)
				throw new IllegalArgumentException("numbers in nums must be greater than zero.");
			sum += nums[i];
		}

		if (sum % 2 == 1)
			return false;

		int n = nums.length;
		int C = sum / 2;

		boolean[] memo = new boolean[C + 1];
		for (int i = 0; i <= C; i++)
			memo[i] = (nums[0] == i);

		for (int i = 1; i < n; i++)
			for (int j = C; j >= nums[i]; j--)
				memo[j] = memo[j] || memo[j - nums[i]];

		return memo[C];
	}

	public static void main(String[] args) {

		int[] nums1 = { 1, 5, 11, 5 };
		printBool((new CanPartition_416()).canPartition(nums1));

		int[] nums2 = { 1, 2, 3, 5 };
		printBool((new CanPartition_416()).canPartition(nums2));
	}

}
