package problems.algorithm.array;

/**
 * @author search
 * @version ����ʱ�䣺2018��4��23�� ����4:05:04 ��˵�� : ɾ�����������е��ظ���
 */
public class RemoveDuplicates_26 {

	public int removeDuplicates(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;
		// �ж�������
		int number = 0;// ��Ǽ���
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != nums[number]) {
				number++;
				nums[number] = nums[i];
			}
		}
		number += 1; // ���+1��Ϊ���ָ���
		return number;
	}

	public int removeDuplicates2(int[] nums) {
		if (nums.length == 0)
			return 0;
		int i = 0;
		for (int j = 1; j < nums.length; j++) {
			if (nums[j] != nums[i]) {
				i++;
				nums[i] = nums[j];
			}
		}
		return i + 1;
	}
}
