package problems.algorithm.array;

/**
 * @author search
 * @version ����ʱ�䣺2018��4��23�� ����3:59:07 ��˵�� :�Ƴ�Ԫ��
 */
public class RemoveElement_27 {
	public int removeElement_27(int[] nums, int val) {
		// if(nums==null||nums.length==0) return 0;
		int i = 0;
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] == val) {
				continue;
			} else {
				nums[i] = nums[j];
				i++;
			}
		}
		return i;
	}
}
