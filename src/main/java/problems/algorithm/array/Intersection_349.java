package problems.algorithm.array;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author Search yaodong199@icloud.com
 * 349. 两个数组的交集
 *
 */
public class Intersection_349 {
	
	//v1 set
	public int[] intersection(int[] nums1, int[] nums2) {
	    
        Set<Integer> nums1Set = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();
        
        for (int i = 0; i < nums1.length; i++) {
            nums1Set.add(nums1[i]);
        }
        
        for (int j = 0; j < nums2.length; j++) {
            if (nums1Set.contains(nums2[j])) {
                resultSet.add(nums2[j]);
            }
        }

        int[] result = resultSet.stream().mapToInt(Number::intValue).toArray();
        return result;
    }
	
	//v2 set优化
	 public int[] intersectionV2(int[] nums1, int[] nums2) {
	        Set<Integer> set = new HashSet<>();
	        Set<Integer> resultSet = new HashSet<>();
	        for(int i : nums1){
	            set.add(i);
	        }
	        for(int i : nums2){
	            if(set.contains(i)){
	                resultSet.add(i);
	            }
	        }
	        int[] result = new int[resultSet.size()];
	        int j = 0;
	        for(int i : resultSet){
	            result[j++] = i;
	        }
	        return result;
	    }

}
