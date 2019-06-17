package problems.algorithm.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LengthOfLongestSubstring_3 {

	public int lengthOfLongestSubstring(String s) {
		int n = s.length();
		Set<Character> set = new HashSet<>();
		int ans = 0, i = 0, j = 0;
		while (i < n && j < n) {
			// try to extend the range [i, j]
			if (!set.contains(s.charAt(j))) {
				set.add(s.charAt(j++));
				ans = Math.max(ans, j - i);
			} else {
				set.remove(s.charAt(i++));
			}
		}
		return ans;
	}

	// optimization
	/**
		 * ��ǩ����������
		�����ⷨʱ�临�ӶȽϸߣ���ﵽ O(n^2)O(n 
		2
		 )���ʶ���ȡ�������ڵķ�������ʱ�临�Ӷ�
		����һ�� map ���ݽṹ�洢 (k, v)������ key ֵΪ�ַ���value ֵΪ�ַ�λ�� +1���� 1 ��ʾ���ַ�λ�ú�һ���ſ�ʼ���ظ�
		���Ƕ��岻�ظ��Ӵ��Ŀ�ʼλ��Ϊ start������λ��Ϊ end
		���� end ���ϱ�����󣬻������� [start, end] �������ַ���ͬ���������ʱ���ַ���Ϊ key ֵ����ȡ�� value ֵ�������� start����ʱ [start, end] �����ڲ������ظ��ַ�
		�����Ƿ���� start����������� map ���ݽṹ�ͽ�� ans��
		ʱ�临�Ӷ�
		https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/solution/hua-jie-suan-fa-3-wu-zhong-fu-zi-fu-de-zui-chang-z/
	 * @param s
	 * @return
	 */
	public int lengthOfLongestSubstring2(String s) {
		int n = s.length(), ans = 0;
		Map<Character, Integer> map = new HashMap<>(); // current index of
														// character
		// try to extend the range [i, j]
		for (int j = 0, i = 0; j < n; j++) {
			if (map.containsKey(s.charAt(j))) {
				i = Math.max(map.get(s.charAt(j)), i);
			}
			ans = Math.max(ans, j - i + 1);
			map.put(s.charAt(j), j + 1);
		}
		return ans;
	}
}
