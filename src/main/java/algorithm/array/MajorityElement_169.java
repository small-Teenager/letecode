package algorithm.array;

import java.util.Arrays;

/**
 * @author search
 * @version ����ʱ�䣺2018��4��23�� ����5:48:01 ��˵�� :������I
 */
public class MajorityElement_169 {
	/**
	 * �����������Ǵ���
	 * 
	 * @param nums
	 * @return
	 */
	public int majorityElement(int[] nums) {
		Arrays.sort(nums);
		return nums[nums.length / 2];
	}
}
