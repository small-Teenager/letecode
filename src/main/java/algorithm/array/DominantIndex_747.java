package algorithm.array;

/**
 * @author search
 * @version 创建时间：2018年4月23日 下午4:26:55 类说明 : 至少是其他数字两倍的最大数
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
