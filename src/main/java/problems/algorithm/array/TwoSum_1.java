package problems.algorithm.array;

import java.util.HashMap;

/**
 * @author search
 * @version ����ʱ�䣺2018��4��23�� ����3:38:58 ��˵�� :����֮��
 */
public class TwoSum_1 {
	// bruteforc
	public int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] == target - nums[i]) {
					return new int[] { i, j };
				}
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}
	
	//v2
	public int[] twoSumV2(int[] nums, int target) {

        HashMap<Integer, Integer> record = new HashMap<Integer, Integer>();
        for(int i = 0 ; i < nums.length; i ++){

            int complement = target - nums[i];
            if(record.containsKey(complement)){
                int[] res = {i, record.get(complement)};
                return res;
            }

            record.put(nums[i], i);
        }

        throw new IllegalStateException("the input has no solution");
    }
}
