package problems.algorithm.array;

import java.util.Arrays;

/**
 * ���������������λ��
 * @author search
 * yaodong199@icloud.com
 */
public class FindMedianSortedArrays_4 {

	/**
	 * ����������ϲ�Ϊһ������
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		//�ϲ�����
		int[] nums = new int[nums1.length + nums2.length];
		for (int i = 0; i < nums1.length; i++) {
			nums[i] = nums1[i];
		}
		for (int i = 0; i < nums2.length; i++) {
			nums[nums1.length + i] = nums2[i];
		}
		Arrays.sort(nums);
		
		//��������鳤��Ϊż�� ��λ����nums[nums.length / 2] + nums[nums.length / 2 - 1]
		if (nums == null || nums.length == 0)
			return 0.0;
		
		if (nums.length % 2 == 0) {
			return (nums[nums.length / 2] + nums[nums.length / 2 - 1]) / 2.0;
		}
		
       //������ĳ���Ϊ��������λ���� nums[nums.length / 2]
		return nums[nums.length / 2];
	}
}
