package algorithm.array;

import java.util.Arrays;

/**
 * @author search
 * @version ����ʱ�䣺2018��4��23�� ����3:42:52 ��˵�� :���������
 */
public class ThirdMax_414 {
	/**
	 * ��������п�������ȡ���������ֵ
	 * 
	 * @param nums
	 * @return
	 */
	public int thirdMax(int[] nums) {
		if (nums.length == 1)
			return nums[0];
		else if (nums.length == 2)
			return nums[0] > nums[1] ? nums[0] : nums[1];
		// take the second of the array sort.
		Arrays.sort(nums);
		int n = 0;
		// there are three different numbers in the array.
		for (int i = nums.length - 1; i > 0; i--) {
			if (nums[i] != nums[i - 1]) {
				n++;
			}
			if (n == 2) {
				return nums[i - 1];
			}
		}
		// one or two different numbers in the array.
		return nums[nums.length - 1];
	}
}
