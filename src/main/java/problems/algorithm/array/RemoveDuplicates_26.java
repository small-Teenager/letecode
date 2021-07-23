package problems.algorithm.array;

/**
 * @author search
 * @version 鍒涘缓鏃堕棿锛�2018骞�4鏈�23鏃� 涓嬪崍4:05:04 绫昏鏄� : 鍒犻櫎鎺掑簭鏁扮粍涓殑閲嶅椤�
 */
public class RemoveDuplicates_26 {

	//v1
	public int removeDuplicates(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;
		// 鍒ゆ柇鏃犺緭鍏�
		int number = 0;// 鏍囪璁℃暟
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != nums[number]) {
				number++;
				nums[number] = nums[i];
			}
		}
		number += 1; // 鏍囪+1鍗充负鏁板瓧涓暟
		return number;
	}
	//v2
	public int removeDuplicates2(int[] nums) {
		if (nums.length == 0)
			return 0;
		int i = 0;
		for (int j = 1; j < nums.length; j++) {
			if (nums[j] != nums[i]) {
				i++;
				nums[i] = nums[j];
			}
		}
		return i + 1;
	}
	//v3
	public int removeDuplicates3(int[] nums) {
		if (nums.length == 0)
			return 0;
		int i = 0;
		for (int j = 1; j < nums.length; j++) {
			if (nums[j] != nums[i]) {
				i++;
				nums[i] = nums[j];
			}
		}
		return i + 1;
	}
}
