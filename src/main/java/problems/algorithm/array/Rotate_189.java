package problems.algorithm.array;

/**
 * @author search
 * @version ����ʱ�䣺2018��4��23�� ����3:54:30 ��˵�� :��ת����
 */
public class Rotate_189 {
	public void rotate(int[] nums, int k) {
		int temp, previous;
		int len = nums.length;
		int n = k % len;

		for (int i = 0; i < n; i++) {
			previous = nums[len - 1];// the last number in the array
			// chang number
			for (int j = 0; j < len; j++) {
				temp = nums[j];
				nums[j] = previous;
				previous = temp;
			}
		}
	}
}