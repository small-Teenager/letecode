package algorithm.sort;

import java.util.HashSet;
import java.util.Set;

/**
 * 两个数组的交集 I
 * 
 * @author search yaodong199@icloud.com
 */
public class Intersection_349 {
	/**
	 * metnod 1
	 * 
	 * @param nums1
	 * @param nums2
	 * @return
	 */
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

	/**
	 * metnod 2
	 * 
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	public int[] intersection2(int[] nums1, int[] nums2) {
		Set<Integer> set = new HashSet<>();
		Set<Integer> resultSet = new HashSet<>();
		for (int i : nums1) {
			set.add(i);
		}
		for (int i : nums2) {
			if (set.contains(i)) {
				resultSet.add(i);
			}
		}
		int[] result = new int[resultSet.size()];
		int j = 0;
		for (int i : resultSet) {
			result[j++] = i;
		}
		return result;
	}
}
