package algorithm.array;

/**
 * @author search
 * @version ����ʱ�䣺2018��4��23�� ����4:26:55 ��˵�� : �������������������������
 */
public class DominantIndex_747 {

	public int dominantIndex(int[] nums) {
		int maxIndex = 0;
		for (int i = 0; i < nums.length; ++i) {
			if (nums[i] > nums[maxIndex]) {
				maxIndex = i;
			}
		}
		for (int i = 0; i < nums.length; ++i) {
			if (maxIndex != i && nums[maxIndex] < 2 * nums[i]) {
				return -1;
			}
		}
		return maxIndex;
	}

	public int dominantIndex2(int[] nums) {
		int max = nums[0];
		int secondMax = 0;
		int index = 0;

		for (int i = 1; i < nums.length; i++) {
			int n = nums[i];
			if (n > max) {
				index = i;
				secondMax = max;
				max = n;
			} else if (n > secondMax) {
				secondMax = n;
			}

		}

		return max >= 2 * secondMax ? index : -1;

	}
}
