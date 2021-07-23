package problems.algorithm.array;

/**
 * 两数之和 II - 输入有序数组
 * 
 * @author search 2018年4月23日 下午3:36:32
 */
public class TwoSum_167 {
	/**
	 * 暴力破解
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
	public int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] == target - nums[i]) {
					return new int[] { i + 1, j + 1 };

				}
				if (nums[i] > target || nums[j] > target) {
					break;
				}
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}
	
	// 二分搜索
	public int[] twoSumV2(int[] numbers, int target) {

        if(numbers.length < 2 /*|| !isSorted(numbers)*/)
            throw new IllegalArgumentException("Illegal argument numbers");

        for(int i = 0 ; i < numbers.length - 1 ; i ++){
            int j = binarySearch(numbers, i+1, numbers.length-1, target - numbers[i]);
            if(j != -1){
                int[] res = {i+1, j+1};
                return res;
            }
        }

        throw new IllegalStateException("The input has no solution");
    }

    private int binarySearch(int[] nums, int l, int r, int target){

        if(l < 0 || l > nums.length)
            throw new IllegalArgumentException("l is out of bound");

        if(r < 0 || r > nums.length)
            throw new IllegalArgumentException("r is out of bound");

        while(l <= r){
            int mid = l + (r - l)/2;
            if(nums[mid] == target)
                return mid;
            if(target > nums[mid])
                l = mid + 1;
            else
                r = mid - 1;
        }

        return -1;
    }
    
    //双指针
    public int[] twoSumV3(int[] numbers, int target) {

        if(numbers.length < 2 /*|| !isSorted(numbers)*/)
            throw new IllegalArgumentException("Illegal argument numbers");

        int l = 0, r = numbers.length - 1;
        while(l < r){

            if(numbers[l] + numbers[r] == target){
                int[] res = {l+1, r+1};
                return res;
            }
            else if(numbers[l] + numbers[r] < target)
                l ++;
            else // numbers[l] + numbers[r] > target
                r --;
        }

        throw new IllegalStateException("The input has no solution");
    }
}