package problems.algorithm.array;

/**
 * @author search
 * @version ����ʱ�䣺2018��4��23�� ����4:16:45 ��˵�� :�ƶ���
 */
public class MoveZeroes_283 {

	public int[] moveZeroes(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == 0) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		return nums;
	}
}
