package problems.algorithm.array;

/**
 * 
 * @author search yaodong199@icloud.com 665. �ǵݼ�����
 */
public class CheckPossibility_665 {
	/**
	 * �ǵݼ����еģ� �������������е� i (1 <= i < n)������ array[i] <= array[i + 1] ��ԭ����ɾ��һ����
	 * �ܷ��Ϊ��������
	 * 
	 * @param nums
	 * @return
	 */
	public boolean checkPossibility(int[] nums) {
		boolean decreasing = false;
		int result = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] > nums[i + 1]) {
				if (decreasing) {
					return false;
				}
				result = i;
				decreasing = true;
			}
		}
		return result == 0 || result == nums.length - 2 || result == nums.length - 1
				|| nums[result - 1] <= nums[result + 1] || nums[result] <= nums[result + 2];
	}

	// �Ƿ�Ϊ����
	// �������У�nums[i]<=nums[i+1]
	public boolean isPossibility(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] > nums[i] + 1) {
				return false;
			}
		}
		return true;
	}
}
