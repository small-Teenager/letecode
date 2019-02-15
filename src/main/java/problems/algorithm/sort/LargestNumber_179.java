package problems.algorithm.sort;

import java.util.Arrays;

/**
 * @author Search
 * @date 2019/1/17
 * 179. ×î´óÊý
 */
public class LargestNumber_179 {


    public String largestNumber(int[] nums) {
        String[] s = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            s[i] = nums[i] + "";
        }
        Arrays.sort(s, (s1, s2) -> (s1 + s2).compareTo(s2 + s1));
        StringBuffer res = new StringBuffer();
        if (s[s.length - 1].charAt(0) == '0') {
            return "0";
        }
        for (int i = s.length - 1; i >= 0; i--) {
            res.append(s[i]);
        }
        return res.toString();
    }
}
