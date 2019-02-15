package problems.algorithm.array;

/**
 * ����֮�� II - ������������
 * 
 * @author search 2018��4��23�� ����3:36:32
 */
public class TwoSum_167 {
	/**
	 * �����ƽ�
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
	public int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] == target - nums[i]) {
					return new int[] { i + 1, j + 1 };

				}
				if (nums[i] > target || nums[j] > target) {
					break;
				}
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}
}