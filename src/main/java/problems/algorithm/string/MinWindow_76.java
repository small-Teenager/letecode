package problems.algorithm.string;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Search yaodong199@icloud.com
 * 
 *         ��С�����Ӵ�
 */
public class MinWindow_76 {

	public String minWindow(String s, String t) {

		if (s.length() == 0 || t.length() == 0) {
			return "";
		}
		// ����t������Ψһ�ַ��������ֵ䡣
		Map<Character, Integer> dictT = new HashMap<Character, Integer>();
		for (int i = 0; i < t.length(); i++) {
			int count = dictT.getOrDefault(t.charAt(i), 0);
			dictT.put(t.charAt(i), count + 1);
		}
		// t�е�Ψһ�ַ�������Ҫ����������Ĵ����С�
		int required = dictT.size();
		// �� �� ָ��
		int l = 0, r = 0;
		/*
		 * formed ���ڸ��ٵ�ǰ��������������Ƶ�ʴ��ڶ��ٸ�Ψһ�ַ��� ���� ���t�ǡ�AABC����ô���ڱ���������A��һ��B��һ��C.
		 * ��ˣ�������������Щ����ʱ��formed = 3��
		 */
		int formed = 0;
		// �ֵ䣬���ڱ��浱ǰ����������Ψһ�ַ��ļ�����
		Map<Character, Integer> windowCounts = new HashMap<Character, Integer>();
		// (���ڳ���, ��ָ��, ��ָ��)
		int[] ans = { -1, 0, 0 };
		while (r < s.length()) {
			// ���Ҳ��򴰿����һ���ַ�
			char c = s.charAt(r);
			int count = windowCounts.getOrDefault(c, 0);
			windowCounts.put(c, count + 1);
			// �����ӵĵ�ǰ�ַ���Ƶ�ʵ���t�е������������formed����1��
			if (dictT.containsKey(c) && windowCounts.get(c).intValue() == dictT.get(c).intValue()) {
				formed++;
			}
			// ���Բ��������ڣ�ֱ���������ǡ�����ġ���
			while (l <= r && formed == required) {
				c = s.charAt(l);
				// ����������������С�Ĵ��ں� l r ָ��
				if (ans[0] == -1 || r - l + 1 < ans[0]) {
					ans[0] = r - l + 1;
					ans[1] = l;
					ans[2] = r;
				}
				// Left��ָ��ָ���λ�ô����ַ������Ǵ��ڵ�һ���֡�
				windowCounts.put(c, windowCounts.get(c) - 1);
				if (dictT.containsKey(c) && windowCounts.get(c).intValue() < dictT.get(c).intValue()) {
					formed--;
				}
				// ����ָ����ǰ�ƶ����⽫�����ڲ����´��ڡ�
				l++;
			}
			// �������󴰿�
			r++;
		}
		return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);
	}

}
