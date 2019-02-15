package problems.algorithm.array;

/**
 * @author search
 * @version ����ʱ�䣺2018��4��23�� ����4:24:57 ��˵�� :�������1�ĸ���
 */
public class FindMaxConsecutiveOnes_485 {
	public int findMaxConsecutiveOnes(int[] nums) {
		int max = 0;
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				count++;
				max = Math.max(max, count);
			} else {
				count = 0;
			}
		}

		return max;
	}
}
