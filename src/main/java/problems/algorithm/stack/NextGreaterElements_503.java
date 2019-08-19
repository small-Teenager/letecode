package problems.algorithm.stack;

import java.util.Arrays;
import java.util.Stack;

/**
 * 503. 下一个更大元素 II
 * 
 * @author search
 *
 */
public class NextGreaterElements_503 {

	public int[] nextGreaterElements(int[] nums) {
		int[] res = new int[nums.length];
		Arrays.fill(res, -1);
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < 2 * nums.length; i++) {
			while (!st.empty() && nums[st.peek()] < nums[i % nums.length]) {
				res[st.pop()] = nums[i % nums.length];
			}
			st.push(i % nums.length);
		}
		return res;
	}
}
