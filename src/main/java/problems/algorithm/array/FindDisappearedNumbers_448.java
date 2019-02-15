package problems.algorithm.array;

import java.util.ArrayList;
import java.util.List;

/** 
* @author search 
* @version ����ʱ�䣺2018��5��6�� ����4:34:56 
* ��˵�� 
*/
public class FindDisappearedNumbers_448 {
	 //����������Ԫ��Ϊ n  
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
