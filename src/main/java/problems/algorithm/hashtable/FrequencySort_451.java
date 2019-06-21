package problems.algorithm.hashtable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * 
 * @author Search yaodong199@ciloud.com 根据字符出现频率排序
 *
 */
public class FrequencySort_451 {

	// HashMap执行一遍统计，然后用列表存储（char-字符, int-重复次数）信息，按重复次数从大到小对列表排序，拼装最终的String
	public String frequencySort(String s) {
		int[] hash = new int[256];
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			hash[s.charAt(i)]++;
		}
		int[] hash1 = hash.clone();// 这个数组是为了找到hash数组排序后对应的下标
		Arrays.sort(hash);// 将数组排序
		for (int i = 255; i >= 0 && hash[i] > 0; i--) {// 为0的部分直接不用管
			for (int j = 0; j < 256; j++) { // 从未排序的里面找到对应值
				if (hash[i] == hash1[j]) {
					while (hash1[j]-- > 0)
						sb.append((char) j);
				}
			}
		}
		return sb.toString();
	}

	// V2 stack
	// 桶排序，将字符的出现次数作为数组的下标，将出现的字符作为数组的内容。根据坐标进行降序，然后把坐标和对应的内容“相乘”后存放在字符串中，返回遍历后的结果
	public static String frequencySortV2(String s) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			char key = s.charAt(i);
			if (!map.containsKey(key))
				map.put(key, 1);
			else
				map.put(key, (int) map.get(key) + 1);
		}
		List[] al = new ArrayList[s.length() + 1];
		for (Object key : map.keySet()) {
			int value = (int) map.get(key);
			if (al[value] == null)
				al[value] = new ArrayList<Character>();
			al[value].add(key);
		}
		StringBuilder result = new StringBuilder();
		for (int i = al.length - 1; i > 0; i--) {
			if (al[i] != null) {
				for (int j = 0; j < al[i].size(); j++) {
					for (int z = 0; z < i; z++)
						result.append(al[i].get(j));
				}
			}
		}
		return result.toString();
	}

}
