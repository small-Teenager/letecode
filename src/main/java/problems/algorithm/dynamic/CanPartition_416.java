package problems.algorithm.dynamic;

import java.util.Arrays;

/**
 * 416. �ָ�Ⱥ��Ӽ�
 * 
 * @author search
 *
 */
public class CanPartition_416 {

	// memo[i][c] ��ʾʹ������Ϊ[0...i]����ЩԪ��,�Ƿ������ȫ���һ������Ϊc�ı���
	// -1 ��ʾΪδ����; 0 ��ʾ���������; 1 ��ʾ�������
	private int[][] memo;

	// V1 ���仯����
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

	// ʹ��nums[0...index], �Ƿ������ȫ���һ������Ϊsum�ı���
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

	// V2 ��̬�滮
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
