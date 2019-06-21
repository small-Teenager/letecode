package problems.algorithm.hashtable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * 
 * @author Search yaodong199@ciloud.com �����ַ�����Ƶ������
 *
 */
public class FrequencySort_451 {

	// HashMapִ��һ��ͳ�ƣ�Ȼ�����б�洢��char-�ַ�, int-�ظ���������Ϣ�����ظ������Ӵ�С���б�����ƴװ���յ�String
	public String frequencySort(String s) {
		int[] hash = new int[256];
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			hash[s.charAt(i)]++;
		}
		int[] hash1 = hash.clone();// ���������Ϊ���ҵ�hash����������Ӧ���±�
		Arrays.sort(hash);// ����������
		for (int i = 255; i >= 0 && hash[i] > 0; i--) {// Ϊ0�Ĳ���ֱ�Ӳ��ù�
			for (int j = 0; j < 256; j++) { // ��δ����������ҵ���Ӧֵ
				if (hash[i] == hash1[j]) {
					while (hash1[j]-- > 0)
						sb.append((char) j);
				}
			}
		}
		return sb.toString();
	}

	// V2 stack
	// Ͱ���򣬽��ַ��ĳ��ִ�����Ϊ������±꣬�����ֵ��ַ���Ϊ��������ݡ�����������н���Ȼ�������Ͷ�Ӧ�����ݡ���ˡ��������ַ����У����ر�����Ľ��
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
