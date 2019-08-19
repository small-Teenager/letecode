package problems.algorithm.array;
import java.util.ArrayList;
/**
 * @author search
 * @version 鍒涘缓鏃堕棿锛�2018骞�4鏈�23鏃� 涓嬪崍4:16:45 绫昏鏄� :绉诲姩闆�
 */
public class MoveZeroes_283 {
	//v1 鏆村姏绉诲姩
	public int[] moveZeroes(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == 0) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		return nums;
	}
	
	//v2  鍒涘缓涓存椂鏁版嵁
	public void moveZeroesV2(int[] nums) {

        ArrayList<Integer> nonZeroElements = new ArrayList<Integer>();

        // 灏唙ec涓墍鏈夐潪0鍏冪礌鏀惧叆nonZeroElements涓�
        for(int i = 0 ; i < nums.length ; i ++)
            if(nums[i] != 0)
                nonZeroElements.add(nums[i]);

        // 灏唍onZeroElements涓殑鎵�鏈夊厓绱犱緷娆℃斁鍏ュ埌nums寮�濮嬬殑浣嶇疆
        for(int i = 0 ; i < nonZeroElements.size() ; i ++)
            nums[i] = nonZeroElements.get(i);

        // 灏唍ums鍓╀綑鐨勪綅缃斁缃负0
        for(int i = nonZeroElements.size() ; i < nums.length ; i ++)
            nums[i] = 0;
    }
	//v3
	 public void moveZeroesV3(int[] nums) {

        int k = 0; // nums涓�, [0...k)鐨勫厓绱犲潎涓洪潪0鍏冪礌

        // 閬嶅巻鍒扮i涓厓绱犲悗,淇濊瘉[0...i]涓墍鏈夐潪0鍏冪礌
        // 閮芥寜鐓ч『搴忔帓鍒楀湪[0...k)涓�
        for(int i = 0 ; i < nums.length ; i ++)
            if( nums[i] != 0 )
                nums[k++] = nums[i];

        // 灏唍ums鍓╀綑鐨勪綅缃斁缃负0
        for(int i = k ; i < nums.length ; i ++)
            nums[i] = 0;
    }
	//v4
	  public void moveZeroesV4(int[] nums) {

        int k = 0; // nums涓�, [0...k)鐨勫厓绱犲潎涓洪潪0鍏冪礌

        // 閬嶅巻鍒扮i涓厓绱犲悗,淇濊瘉[0...i]涓墍鏈夐潪0鍏冪礌
        // 閮芥寜鐓ч『搴忔帓鍒楀湪[0...k)涓�
        // 鍚屾椂, [k...i] 涓� 0
        for(int i = 0 ; i < nums.length ; i ++)
            if(nums[i] != 0)
                swap(nums, k++, i);
    }

    private void swap(int[] nums, int i, int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
	//v5
    	public void moveZeroesV5(int[] nums) {

        int k = 0; // nums涓�, [0...k)鐨勫厓绱犲潎涓洪潪0鍏冪礌

        // 閬嶅巻鍒扮i涓厓绱犲悗,淇濊瘉[0...i]涓墍鏈夐潪0鍏冪礌
        // 閮芥寜鐓ч『搴忔帓鍒楀湪[0...k)涓�
        // 鍚屾椂, [k...i] 涓� 0
        for(int i = 0 ; i < nums.length ; i ++)
            if(nums[i] != 0)
                if(k != i)
                    swap(nums, k++, i);
                else
                    k ++;
    }

}
