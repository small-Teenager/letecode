package algorithm.array;

import java.util.Arrays;

/** 
* @author search 
* @version 创建时间：2018年4月23日 下午4:43:19 
* 类说明 :寻找重复数
*/
public class FindDuplicate_287 {
	
	public int findDuplicate(int[] nums) {
		Arrays.sort(nums);
		int j = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[j] == nums[i]) {
				return nums[j];
			}
			j++;
		}
		return -1;      
	    }
}
