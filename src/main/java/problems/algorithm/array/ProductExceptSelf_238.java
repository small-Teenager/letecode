package problems.algorithm.array;

/**
 * 238. 除自身以外数组的乘积
 * 
 * @author search
 *
 */
public class ProductExceptSelf_238 {
	/**
	 * 看到题目描述的时候首先想到的是求数组的乘积和sum 然后遍历数组 sum/nums[i]
	 * 但是又发现当数组的存在0时 是不成立的 如 0 1 2
	 * @param nums
	 * @return
	 */
	public int[] productExceptSelf(int[] nums) {
		int[] res = new int[nums.length];
		for (int n = 1, i = 0; i < nums.length; n *= nums[i++]) {
			res[i] = n;
		}
		for (int n = 1, i = nums.length - 1; i >= 0; n *= nums[i--]) {
			res[i] *= n;
		}
		return res;
	}
	
	public int[] productExceptSelf2(int[] nums) {
	    int n = nums.length;
	    int[] res = new int[n];
	    res[0] = 1;
	    for (int i = 1; i < n; i++) {
	        res[i] = res[i - 1] * nums[i - 1];
	    }
	    int right = 1;
	    for (int i = n - 1; i >= 0; i--) {
	        res[i] *= right;
	        right *= nums[i];
	    }
	    return res;
	}
}
