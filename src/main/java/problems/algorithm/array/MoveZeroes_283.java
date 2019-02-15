package problems.algorithm.array;

/**
 * @author search
 * @version 创建时间：2018年4月23日 下午4:16:45 类说明 :移动零
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
