package problems.algorithm.array;

/**
 * @author Search
 * @data 17:58 2019/2/26
 * 寻找峰值 162
 */
public class FindPeakElement_162 {
    /**
     * 数组中每个元素都不相等
     * 找到所有峰值 随机返回其中的一个
     * 二分法，如果中间的是峰值直接返回，如果不是，那么两边较大的那一侧是存在峰值的。
     */
    public int findPeakElement(int[] nums) {
        int l = 0, r = nums.length-1;
        while(l <= r){
            int mid = (r - l) / 2 + l;
            if((mid <= l || nums[mid] > nums[mid-1]) &&
                     (mid >= r || nums[mid] > nums[mid+1]))
            { return mid;}
            if(mid <= l || nums[mid] > nums[mid-1])
            { l = mid + 1;}
            else
            { r = mid - 1;}
        }
        return -1;
    }
}
