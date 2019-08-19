package problems.algorithm.array;

/**
 * @author Search
 * @data 17:58 2019/2/26
 * 瀵绘壘宄板�� 162
 */
public class FindPeakElement_162 {
    /**
     * 鏁扮粍涓瘡涓厓绱犻兘涓嶇浉绛�
     * 鎵惧埌鎵�鏈夊嘲鍊� 闅忔満杩斿洖鍏朵腑鐨勪竴涓�
     * 浜屽垎娉曪紝濡傛灉涓棿鐨勬槸宄板�肩洿鎺ヨ繑鍥烇紝濡傛灉涓嶆槸锛岄偅涔堜袱杈硅緝澶х殑閭ｄ竴渚ф槸瀛樺湪宄板�肩殑銆�
     */
    public int findPeakElement(int[] nums) {
        int l = 0, r = nums.length-1;
        while(l <= r){
            int mid = (r - l) / 2 + l;
            if((mid <= l || nums[mid] > nums[mid-1]) &&
                     (mid >= r || nums[mid] > nums[mid+1]))
            { return mid;}
            if(mid <= l || nums[mid] > nums[mid-1])
            { l = mid + 1;}
            else
            { r = mid - 1;}
        }
        return -1;
    }
}
