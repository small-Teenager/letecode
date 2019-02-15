package problems.algorithm.array;

/**
 * @author Search
 * 在排序数组中查找元素的第一个和最后一个位置 34
 * @date 2019/1/14
 */
public class SearchRange_34 {

    /**
     * 遍历数组 前序、后序遍历数组
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
     * 二次二分查找
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
        // 两次二分查找
        // 第一次
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) >> 1;
            if (nums[mid] == target) {
                // mid==0 就不会判断后面的了
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
        // 第二次
        end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) >> 1;
            if (nums[mid] == target) {
                // mid==0 就不会判断后面的了
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
