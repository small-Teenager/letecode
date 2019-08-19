package problems.algorithm.array;
/**
 * @author Search
 * @date 2019/5/17
 * 581. 鏈�鐭棤搴忚繛缁瓙鏁扮粍
 */
public class FindUnsortedSubarray_581 {
    //鍙傝�冧簡璇勮鍖虹殑瑙ｉ锛屾�濊矾鏄竴鏍风殑 娌″啓鍑烘潵...
   public int findUnsortedSubarray(int[] nums) {
        // 绗竴涓ぇ鍊间笉姝ｇ‘鐨勭储寮�
        int high = 0;
        // 绗竴涓皬鍊间笉姝ｇ‘鐨勭储寮�
        int low = 1;
        // 璁板綍浠庡乏鍒板彸鐨勫綋鍓嶆渶澶у��
        int maxValue = 0;
        // 璁板綍浠庡彸鍒板乏鐨勫綋鍓嶆渶灏忓��
        int minValue = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                maxValue = nums[i];
            } else {
                if (nums[i] < maxValue) {
                    high = i;
                }
                maxValue = Math.max(maxValue, nums[i]);
            }
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == nums.length - 1) {
                minValue = nums[i];
            } else {
                if (nums[i] > minValue) {
                    low = i;
                }
                minValue = Math.min(minValue, nums[i]);
            }
        }
        return high - low + 1;
    }
}
