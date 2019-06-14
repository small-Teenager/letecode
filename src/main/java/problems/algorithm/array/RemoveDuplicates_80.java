package problems.algorithm.array;

import java.util.Arrays;

/**
 * @author search
 * 80. 删除排序数组中的重复项 II
 */
public class RemoveDuplicates_80 {

	public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums)
            if (i < 2 || n > nums[i-2])
                nums[i++] = n;
        return i;
    }
}
