package problems.algorithm.hashtable;

import java.util.TreeSet;

/**
 * 
 * @author Search yaodong199@ciloud.com �ҵ��ַ�����������ĸ��λ��
 *
 */
public class ContainsNearbyAlmostDuplicate_220 {

	public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {

		// �������Ĳ���������ʹ��int���мӼ�����ʱ�����
		// ����ʹ��long long
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
