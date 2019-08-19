package problems.algorithm.hashtable;

import java.util.TreeSet;

/**
 * 
 * @author Search yaodong199@ciloud.com 找到字符串中所有字母异位词
 *
 */
public class ContainsNearbyAlmostDuplicate_220 {

	public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {

		// 这个问题的测试数据在使用int进行加减运算时会溢出
		// 所以使用long long
		TreeSet<Long> record = new TreeSet<Long>();
		for (int i = 0; i < nums.length; i++) {

			if (record.ceiling((long) nums[i] - (long) t) != null
					&& record.ceiling((long) nums[i] - (long) t) <= (long) nums[i] + (long) t)
				return true;

			record.add((long) nums[i]);

			if (record.size() == k + 1)
				record.remove((long) nums[i - k]);
		}

		return false;
	}
}
