package problems.algorithm.array;

/**
 * @author search
 * @version 创建时间：2018年4月23日 下午3:59:07 类说明 :移除元素
 */
public class RemoveElement_27 {
	//v1
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
	//v2
	public int removeElementV2(int[] nums, int val) {
		int count = 0;
		for (int i = 0; i < nums.length; i++)
			if (nums[i] != val)
				nums[count++] = nums[i];

		return count;
	}
}
