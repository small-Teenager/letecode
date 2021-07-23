package problems.algorithm.array;

import java.util.Arrays;

/**
 * @author search
 * @version 创建时间：2018年4月23日 下午4:30:40 类说明 :存在重复
 */
public class ContainsDuplicate_217 {
	public boolean containsDuplicate(int[] nums) {
		Arrays.sort(nums);
		int j = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[j] == nums[i]) {
				return true;
			}
			j++;
		}
		return false;
	}
}
