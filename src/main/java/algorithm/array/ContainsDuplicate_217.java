package algorithm.array;

import java.util.Arrays;

/**
 * @author search
 * @version ����ʱ�䣺2018��4��23�� ����4:30:40 ��˵�� :�����ظ�
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
