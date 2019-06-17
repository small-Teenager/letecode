package problems.algorithm.array;

/**
 * 
 * @author Search 75. ��ɫ����
 */
public class SortColors_75 {

	// 1 ���������㷨
	// 2 ��������
	public void sortColors(int[] nums) {

		int[] count = { 0, 0, 0 }; // ���0, 1, 2����Ԫ�ص�Ƶ��
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
	
	//v2 ��·����   һ�α����������0�����ƶ�����ͷ�������2�����ƶ�����β�����ÿ���1
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
