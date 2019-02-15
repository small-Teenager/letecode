package problems.algorithm.array;

import java.util.Arrays;

/**
 * @author search
 * @version 创建时间：2018年4月23日 下午4:39:36 类说明 :数组拆分 I
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
