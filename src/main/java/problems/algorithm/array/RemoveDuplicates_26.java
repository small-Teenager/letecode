package problems.algorithm.array;

/**
 * @author search
 * @version 创建时间：2018年4月23日 下午4:05:04 类说明 : 删除排序数组中的重复项
 */
public class RemoveDuplicates_26 {

	//v1
	public int removeDuplicates(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;
		// 判断无输入
		int number = 0;// 标记计数
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != nums[number]) {
				number++;
				nums[number] = nums[i];
			}
		}
		number += 1; // 标记+1即为数字个数
		return number;
	}
	//v2
	public int removeDuplicates2(int[] nums) {
		if (nums.length == 0)
			return 0;
		int i = 0;
		for (int j = 1; j < nums.length; j++) {
			if (nums[j] != nums[i]) {
				i++;
				nums[i] = nums[j];
			}
		}
		return i + 1;
	}
	//v3
	public int removeDuplicates3(int[] nums) {
		if (nums.length == 0)
			return 0;
		int i = 0;
		for (int j = 1; j < nums.length; j++) {
			if (nums[j] != nums[i]) {
				i++;
				nums[i] = nums[j];
			}
		}
		return i + 1;
	}
}
