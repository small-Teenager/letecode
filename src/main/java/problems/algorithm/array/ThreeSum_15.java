package problems.algorithm.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author search yaodong199@icloud.com 三数之和
 */
public class ThreeSum_15 {
	//method 1
	public List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> result = new ArrayList<>();
		for (int i = 0; i < nums.length - 2; i++) {
			int twoSum = -nums[i];
			int p1 = i + 1;
			int p2 = nums.length - 1;
			while (p1 < p2) {
				int sum = nums[p1] + nums[p2];
				if (sum == twoSum) {
					result.add(Arrays.asList(nums[i], nums[p1], nums[p2]));
					int prevP1 = p1;
					while (p1 < p2 && nums[p1] == nums[prevP1]) // Here
						p1++;
					p2--;
				} else if (sum < twoSum) {
					p1++;
				} else if (sum > twoSum) {
					p2--;
				}
			}
			int prevI = i;
			while (i < nums.length && nums[i] == nums[prevI]) // And Here
				i++;
			i--;
		}
		return result;
	}
	//method 2
	public List<List<Integer>> threeSum2(int[] nums) {
	    List<List<Integer>> res = new ArrayList<>();
	    Arrays.sort(nums);
	    for (int i = 0; i + 2 < nums.length; i++) {
	        if (i > 0 && nums[i] == nums[i - 1]) {              // skip same result
	            continue;
	        }
	        int j = i + 1, k = nums.length - 1;  
	        int target = -nums[i];
	        while (j < k) {
	            if (nums[j] + nums[k] == target) {
	                res.add(Arrays.asList(nums[i], nums[j], nums[k]));
	                j++;
	                k--;
	                while (j < k && nums[j] == nums[j - 1]) j++;  // skip same result
	                while (j < k && nums[k] == nums[k + 1]) k--;  // skip same result
	            } else if (nums[j] + nums[k] > target) {
	                k--;
	            } else {
	                j++;
	            }
	        }
	    }
	    return res;
	}
}
