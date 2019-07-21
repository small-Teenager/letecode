package problems.algorithm.dynamic;

import java.util.Arrays;

/**
 * 198. ��ҽ���
 * 
 * @author search
 *
 */
public class Rob_198 {

	// V1 ���仰����
	// memo[i] ��ʾ�������� nums[i...n) ���ܻ�õ��������
	private int[] memo;

	public int rob(int[] nums) {
		memo = new int[nums.length];
		Arrays.fill(memo, -1);
		return tryRob(nums, 0);
	}

	// ��������nums[index...nums.size())�����Χ�����з���
	private int tryRob(int[] nums, int index) {

		if (index >= nums.length)
			return 0;

		if (memo[index] != -1)
			return memo[index];

		int res = 0;
		for (int i = index; i < nums.length; i++)
			res = Math.max(res, nums[i] + tryRob(nums, i + 2));
		memo[index] = res;
		return res;
	}

	// v2 ��̬�滮
	public int robv2(int[] nums) {

		int n = nums.length;
		if (n == 0)
			return 0;

		// memo[i] ��ʾ�������� nums[i...n) ���ܻ�õ��������
		int[] memo = new int[nums.length];
		memo[n - 1] = nums[n - 1];
		for (int i = n - 2; i >= 0; i--)
			for (int j = i; j < n; j++)
				memo[i] = Math.max(memo[i], nums[j] + (j + 2 < n ? memo[j + 2] : 0));

		return memo[0];
	}

	public static void main(String[] args) {

		int nums[] = { 2, 1 };
		System.out.println((new Rob_198()).rob(nums));
		System.out.println((new Rob_198()).robv2(nums));
	}
}
