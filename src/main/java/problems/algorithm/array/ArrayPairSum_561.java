package problems.algorithm.array;

import java.util.Arrays;

/**
 * @author search
 * @version ����ʱ�䣺2018��4��23�� ����4:39:36 ��˵�� :������ I
 */
public class ArrayPairSum_561 {

	public int arrayPairSum(int[] nums) {
		Arrays.sort(nums);
		int result = 0;
		for (int i = 0; i < nums.length; i += 2) {
			result += nums[i];
		}
		return result;
	}
}
