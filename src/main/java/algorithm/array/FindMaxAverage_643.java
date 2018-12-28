package algorithm.array;

/**
 * 
 * @author search 643. 子数组最大平均数 I
 */
public class FindMaxAverage_643 {

	public double findMaxAverage(int[] nums, int k) {
		double sum = 0;
		// 求和：数组前k个的和
		for (int i = 0; i < k; i++)
			sum += nums[i];

		double max = sum;
		// 比较max跟后续数组的大小
		for (int i = k; i < nums.length; i++) {
			sum += nums[i] - nums[i - k];
			max = Math.max(max, sum);
		}

		return max / k;
	}
}
