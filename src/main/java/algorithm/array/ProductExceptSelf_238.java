package algorithm.array;

/**
 * 238. ��������������ĳ˻�
 * 
 * @author search
 *
 */
public class ProductExceptSelf_238 {
	/**
	 * ������Ŀ������ʱ�������뵽����������ĳ˻���sum Ȼ��������� sum/nums[i]
	 * �����ַ��ֵ�����Ĵ���0ʱ �ǲ������� �� 0 1 2
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
