package problems.algorithm.array;

/**
 * 
 * @author Search
 *	88. �ϲ�������������
 */
public class Merge_88 {

	//1 ������ϲ�֮������
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int index1 = m - 1;
		int index2 = n - 1;
		for (int i = nums1.length - 1; i >= 0; i--) {
			if (index1 >= 0 && index2 >= 0) {
				if (nums1[index1] >= nums2[index2]) {
					nums1[i] = nums1[index1];
					index1--;
				} else {
					nums1[i] = nums2[index2];
					index2--;
				}
			} else {
				while (index2 >= 0) {
					nums1[i] = nums2[index2];
					i--;
					index2--;
				}
			}
		}
	}

	// V2 ��β����ʼ�ϲ���ÿ���ҳ����ģ�����һ��ɨ�輴�����
	public void mergeV2(int[] nums1, int m, int[] nums2, int n) {
		// �ȹ鲢��ģ�����һ��ɨ�漴�ɡ�
		for (int k = m + n - 1, i = m - 1, j = n - 1; k >= 0; k--) {
			if (i < 0) {
				nums1[k] = nums2[j--];
				continue;
			}
			if (j < 0) {
				nums1[k] = nums1[i--];
				continue;
			}

			if (nums1[i] >= nums2[j])
				nums1[k] = nums1[i--];
			else
				nums1[k] = nums2[j--];
		}
	}

}
