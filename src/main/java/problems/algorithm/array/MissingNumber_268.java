package problems.algorithm.array;

import java.util.Arrays;

/** 
* @author search 
* @version ����ʱ�䣺2018��4��23�� ����4:19:03 
* ��˵�� :ȱʧ����
*/
public class MissingNumber_268 {
	public int missingNumber(int[] nums) {
		Arrays.sort(nums);
		if (nums[0] != 0)
			return 0;
		int n = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] - nums[n] != 1) {
				return nums[n] + 1;
			}
			n++;
		}
	
		return nums[n] + 1;
	}
	 public int missingNumber2(int[] nums) {
			Arrays.sort(nums);
			if (nums[0] != 0)
				return 0;
			int n = 0;
			for (int i = 1; i < nums.length; i++) {
				if (nums[i] - nums[n] != 1) {
					return nums[n] + 1;
				}
				n++;
			}
			if (nums[nums.length - 1] == Integer.MAX_VALUE) {
				throw new IllegalArgumentException("Out of range");
			}
			return nums[n] + 1;
		}
}
