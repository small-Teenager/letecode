package problems.algorithm.array;
/**
 * @author Search
 * @date 2019/5/17
 * 581. 最短无序连续子数组
 */
public class FindUnsortedSubarray_581 {
    //参考了评论区的解题，思路是一样的 没写出来...
   public int findUnsortedSubarray(int[] nums) {
        // 第一个大值不正确的索引
        int high = 0;
        // 第一个小值不正确的索引
        int low = 1;
        // 记录从左到右的当前最大值
        int maxValue = 0;
        // 记录从右到左的当前最小值
        int minValue = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                maxValue = nums[i];
            } else {
                if (nums[i] < maxValue) {
                    high = i;
                }
                maxValue = Math.max(maxValue, nums[i]);
            }
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == nums.length - 1) {
                minValue = nums[i];
            } else {
                if (nums[i] > minValue) {
                    low = i;
                }
                minValue = Math.min(minValue, nums[i]);
            }
        }
        return high - low + 1;
    }
}
