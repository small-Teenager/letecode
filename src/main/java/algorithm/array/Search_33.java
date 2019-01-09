package algorithm.array;

/**
 * @author Search
 * 搜索旋转排序数组 33
 * @date 2019/1/9
 */
public class Search_33 {

    /**
     *  O(N)竟然也过啦
     *  这一份代码一不小心提交了两次，
     *  竟然缩小了6ms
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
     * 判断数组的旋转状态
     * 数组分为左侧部分和右侧部分（以旋转点）
     * 判断target在哪一部分
     * 二分查找
     */
}
