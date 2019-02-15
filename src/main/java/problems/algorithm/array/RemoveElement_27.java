package problems.algorithm.array;

/**
 * @author search
 * @version 创建时间：2018年4月23日 下午3:59:07 类说明 :移除元素
 */
public class RemoveElement_27 {
	public int removeElement_27(int[] nums, int val) {
		// if(nums==null||nums.length==0) return 0;
		int i = 0;
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] == val) {
				continue;
			} else {
				nums[i] = nums[j];
				i++;
			}
		}
		return i;
	}
}
