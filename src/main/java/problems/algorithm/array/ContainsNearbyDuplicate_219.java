package problems.algorithm.array;

import java.util.HashSet;

/**
 * @author search
 * @version 创建时间：2018年4月23日 下午4:34:14 类说明 :存在重复 II
 */
public class ContainsNearbyDuplicate_219 {

	// v1 暴力破解
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j] && Math.abs(i - j) <= k) {
					return true;
				}
			}
		}
		return false;
	}

	// v2 查找表
	public boolean containsNearbyDuplicateV2(int[] nums, int k) {

		if (nums == null || nums.length <= 1)
			return false;

		if (k <= 0)
			return false;

		HashSet<Integer> record = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (record.contains(nums[i]))
				return true;

			record.add(nums[i]);
			if (record.size() == k + 1)
				record.remove(nums[i - k]);
		}

		return false;
	}
}
