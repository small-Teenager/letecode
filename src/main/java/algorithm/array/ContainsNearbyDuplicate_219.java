package algorithm.array;

/**
 * @author search
 * @version ����ʱ�䣺2018��4��23�� ����4:34:14 ��˵�� :�����ظ� II
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
