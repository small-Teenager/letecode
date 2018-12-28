package algorithm.array;

/**
 * @author search
 * @version ����ʱ�䣺2018��4��23�� ����3:50:25 ��˵��:��������λ��
 */
public class SearchInsert_35 {
	public int searchInsert(int[] nums, int target) {
		if (nums == null || nums.length == 0)
			return 0;
		else if (target > nums[nums.length - 1])
			return nums.length;
		else if (target < nums[0])
			return 0;
		int i = 0;
		for (; i < nums.length; i++) {
			if (nums[i] == target) {
				break;
			} else if (target <= nums[i]) {
				break;
			}
		}
		return i;
	}
}
