package algorithm.array;

import java.util.Arrays;

/** 
* @author search 
* @version ����ʱ�䣺2018��4��23�� ����4:43:19 
* ��˵�� :Ѱ���ظ���
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
