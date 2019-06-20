package problems.algorithm.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author Search yaodong199@icloud.com 350. 两个数组的交集II
 */
public class Intersect_350 {

	public int[] intersect(int[] nums1, int[] nums2) {
		if (nums1 == null || nums1.length == 0) {
			return nums1;
		}
		if (nums2 == null || nums2.length == 0) {
			return nums2;
		}
		List<Integer> list = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : nums1) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}
		for (int i : nums2) {
			if (map.containsKey(i) && map.get(i) > 0) {
				list.add(i);
				map.put(i, map.getOrDefault(i, 0) - 1);
			}
		}
		int l = list.size();
		int[] res = new int[l];
		for (int i = 0; i < l; i++) {
			res[i] = list.get(i);
		}
		return res;
	}

}
