package problems.algorithm.array;

/**
 * @author Search
 * �����������в���Ԫ�صĵ�һ�������һ��λ�� 34
 * @date 2019/1/14
 */
public class SearchRange_34 {

    /**
     * �������� ǰ�򡢺����������
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                res[0] = i;
                break;
            }
        }
        if (res[0] == -1) {
            return res;
        }

        for (int j = nums.length - 1; j >= 0; j--) {
            if (target == nums[j]) {
                res[1] = j;
                break;
            }
        }
        return res;
    }

    /***
     * ���ζ��ֲ���
     * @param nums
     * @param target
     * @return
     */
    public int[] searchRange2(int[] nums, int target) {
        int[] res = {-1, -1};
        if (null == nums || nums.length == 0) {
            return res;
        }
        if (target < nums[0] || target > nums[nums.length - 1]) {
            return res;
        }
        // ���ζ��ֲ���
        // ��һ��
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) >> 1;
            if (nums[mid] == target) {
                // mid==0 �Ͳ����жϺ������
                if (mid == 0 || nums[mid - 1] != nums[mid]) {
                    res[0] = mid;
                    break;
                } else {
                    end = mid - 1;
                }
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        start = 0;
        // �ڶ���
        end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) >> 1;
            if (nums[mid] == target) {
                // mid==0 �Ͳ����жϺ������
                if (mid == nums.length - 1 || nums[mid + 1] != nums[mid]) {
                    res[1] = mid;
                    break;
                } else {
                    start = mid + 1;
                }
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return res;
    }
}
