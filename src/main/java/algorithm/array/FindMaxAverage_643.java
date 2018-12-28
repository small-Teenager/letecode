package algorithm.array;

/**
 * 
 * @author search 643. ���������ƽ���� I
 */
public class FindMaxAverage_643 {

	public double findMaxAverage(int[] nums, int k) {
		double sum = 0;
		// ��ͣ�����ǰk���ĺ�
		for (int i = 0; i < k; i++)
			sum += nums[i];

		double max = sum;
		// �Ƚ�max����������Ĵ�С
		for (int i = k; i < nums.length; i++) {
			sum += nums[i] - nums[i - k];
			max = Math.max(max, sum);
		}

		return max / k;
	}
}
