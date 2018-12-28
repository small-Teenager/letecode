package algorithm.array;

/**
 * @author search
 * @version 创建时间：2018年4月23日 下午4:34:14 类说明 :存在重复 II
 */
public class ContainsNearbyDuplicate_219 {

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
}
