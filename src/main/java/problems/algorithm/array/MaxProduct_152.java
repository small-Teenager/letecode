package problems.algorithm.array;

/**
 * @author search
 * @version 创建时间：2018年4月23日 下午4:45:49 类说明 :乘积最大子序列
 */
public class MaxProduct_152 {
	// 从开始和结束计算，当结果为0重置为1，选择之间的最大值。
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
