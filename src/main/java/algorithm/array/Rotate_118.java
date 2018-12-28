package algorithm.array;
/** 
* @author search 
* @version 创建时间：2018年5月6日 下午4:36:05 
* 类说明 
*/
public class Rotate_118 {
	public void rotate(int[] nums, int k) {
        int temp, previous;
        int len = nums.length;
        int n = k % len;

        for (int i = 0; i < n; i++) {
            previous = nums[len - 1];// the last number in the array
            //chang number
            for (int j = 0; j < len; j++) {
                temp = nums[j];
                nums[j] = previous;
                previous = temp;
            }
        }
    }
}
