package algorithm.array;

/**
 * @author Search
 * ������ת�������� 33
 * @date 2019/1/9
 */
public class Search_33 {

    /**
     *  O(N)��ȻҲ����
     *  ��һ�ݴ���һ��С���ύ�����Σ�
     *  ��Ȼ��С��6ms
     *
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                return i;
            }
        }
        return -1;
    }

    /**
     *  O(log n)
     * �ж��������ת״̬
     * �����Ϊ��ಿ�ֺ��Ҳಿ�֣�����ת�㣩
     * �ж�target����һ����
     * ���ֲ���
     */
}
