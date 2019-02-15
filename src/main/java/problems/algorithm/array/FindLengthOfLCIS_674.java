package problems.algorithm.array;

/**
 * @author Search
 * @date 2019/1/17
 * 最长连续递增序列 674.
 */
public class FindLengthOfLCIS_674 {

    public int findLengthOfLCIS(int[] nums) {
        int res = 0,i=0;

        while (i < nums.length) {
            int currentLen = 1;
            int currentVal = nums[i];

            int j = i + 1;
            while (j < nums.length && nums[j] > currentVal) {
                currentLen++;
                currentVal = nums[j];
                j++;
            }
            i = i + currentLen;

            if (currentLen > res) {
                res = currentLen;
            }
        }
        return res;
    }
}
