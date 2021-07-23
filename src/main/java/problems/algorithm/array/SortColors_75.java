package problems.algorithm.array;

/**
 * 
 * @author Search 75. 颜色分类
 */
public class SortColors_75 {

	// 1 常规排序算法
	// 2 计数排序
	public void sortColors(int[] nums) {

		int[] count = { 0, 0, 0 }; // 存放0, 1, 2三个元素的频率
		for (int i = 0; i < nums.length; i++) {
			assert nums[i] >= 0 && nums[i] <= 2;
			count[nums[i]]++;
		}

		int index = 0;
		for (int i = 0; i < count[0]; i++)
			nums[index++] = 0;
		for (int i = 0; i < count[1]; i++)
			nums[index++] = 1;
		for (int i = 0; i < count[2]; i++)
			nums[index++] = 2;
	}
	
	//v2 三路快排   一次遍历，如果是0，则移动到表头，如果是2，则移动到表尾，不用考虑1
	public void sortColorsV2(int[] nums) {

        int zero = -1;          // [0...zero] == 0
        int two = nums.length;  // [two...n-1] == 2
        for(int i = 0 ; i < two ; ){
            if(nums[i] == 1)
                i ++;
            else if (nums[i] == 2)
                swap(nums, i, --two);
            else{ // nums[i] == 0
                assert nums[i] == 0;
                swap(nums, ++zero, i++);
            }
        }
    }

    private void swap(int[] nums, int i, int j){
        int t = nums[i];
        nums[i]= nums[j];
        nums[j] = t;
    }

}
