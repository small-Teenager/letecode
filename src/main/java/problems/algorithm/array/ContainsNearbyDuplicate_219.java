package problems.algorithm.array;

import java.util.HashSet;

/**
 * @author search
 * @version ����ʱ�䣺2018��4��23�� ����4:34:14 ��˵�� :�����ظ� II
 */
public class ContainsNearbyDuplicate_219 {

	// v1 �����ƽ�
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

	// v2 ���ұ�
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
