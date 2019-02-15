package problems.algorithm.array;

/**
 * @author search
 * @version ����ʱ�䣺2018��4��23�� ����4:45:49 ��˵�� :�˻����������
 */
public class MaxProduct_152 {
	// �ӿ�ʼ�ͽ������㣬�����Ϊ0����Ϊ1��ѡ��֮������ֵ��
	public int maxProduct(int[] nums) {
		int res = Integer.MIN_VALUE, first = 1, second = 1, n = nums.length;

		for (int i = 0; i < n; i++) {
			first *= nums[i];
			second *= nums[n - 1 - i];
			res = Math.max(res, Math.max(first, second));

			if (first == 0)
				first = 1;
			if (second == 0)
				second = 1;
		}

		return res;

	}
}
