package algorithm.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 两个数组的交集 II
 * 
 * @author search yaodong199@icloud.com
 */
public class Intersect_350 {
	/**
	 * method 1
	 * 
	 * @param nums1
	 * @param nums2
	 * @return
	 */
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

	/**
	 * metnod 2 sort array
	 * 
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	public int[] intersect2(int[] nums1, int[] nums2) {
		if (nums1 == null || nums1.length == 0) {
			return nums1;
		}
		if (nums2 == null || nums2.length == 0) {
			return nums2;
		}
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int p1 = 0, p2 = 0, count = 0;
		int[] tmp = new int[Math.max(nums1.length, nums2.length)];
		while (p1 != nums1.length && p2 != nums2.length) {
			if (nums1[p1] == nums2[p2]) {
				tmp[count] = nums1[p1];
				count++;
				p1++;
				p2++;
			} else if (nums1[p1] < nums2[p2])
				p1++;
			else
				p2++;
		}
		return Arrays.copyOf(tmp, count);
	}
}
