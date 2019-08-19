package problems.algorithm.array;

import java.util.ArrayList;
import java.util.List;

/** 
* @author search 
* @version 创建时间：2018年5月6日 下午4:34:56 
* 类说明 
*/
public class FindDisappearedNumbers_448 {
	 //数组中最大的元素为 n  
	   public List<Integer> findDisappearedNumbers(int[] nums) {
			List<Integer> list = new ArrayList<>();
			int[] arr = new int[nums.length];
			for (int i = 0; i < nums.length; i++) {
				arr[nums[i] - 1]--;
			}
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == 0) {
					list.add(j + 1);
				}
			}
			return list;
		}
}
