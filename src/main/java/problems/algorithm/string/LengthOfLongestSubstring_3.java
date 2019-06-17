package problems.algorithm.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 
 * @author Search yaodong199@icloud.com 3. ���ظ��ַ�����Ӵ�
 */
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
	 * ��ǩ���������� �����ⷨʱ�临�ӶȽϸߣ���ﵽ O(n^2)O(n 2 )���ʶ���ȡ�������ڵķ�������ʱ�临�Ӷ� ����һ�� map ���ݽṹ�洢 (k,
	 * v)������ key ֵΪ�ַ���value ֵΪ�ַ�λ�� +1���� 1 ��ʾ���ַ�λ�ú�һ���ſ�ʼ���ظ� ���Ƕ��岻�ظ��Ӵ��Ŀ�ʼλ��Ϊ
	 * start������λ��Ϊ end ���� end ���ϱ�����󣬻������� [start, end] �������ַ���ͬ���������ʱ���ַ���Ϊ key ֵ����ȡ��
	 * value ֵ�������� start����ʱ [start, end] �����ڲ������ظ��ַ� �����Ƿ���� start����������� map ���ݽṹ�ͽ��
	 * ans�� ʱ�临�Ӷ�
	 * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/solution/hua-jie-suan-fa-3-wu-zhong-fu-zi-fu-de-zui-chang-z/
	 * 
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

	// ��������
	public int lengthOfLongestSubstringV3(String s) {

		int[] freq = new int[256];

		int l = 0, r = -1; // ��������Ϊs[l...r]
		int res = 0;

		// ����ѭ���� l == 0; r == -1 ����մ��ڿ�ʼ
		// ��l == s.size(); r == s.size()-1 ����մ��ڽ�ֹ
		// ��ÿ��ѭ�����𽥸ı䴰��, ά��freq, ����¼��ǰ�������Ƿ��ҵ���һ���µ�����ֵ
		while (l < s.length()) {

			if (r + 1 < s.length() && freq[s.charAt(r + 1)] == 0)
				freq[s.charAt(++r)]++;
			else // r�Ѿ���ͷ || freq[s[r+1]] == 1
				freq[s.charAt(l++)]--;

			res = Math.max(res, r - l + 1);
		}

		return res;
	}

	// ��������
	public int lengthOfLongestSubstringV4(String s) {

		int[] freq = new int[256];

		int l = 0, r = -1; // ��������Ϊs[l...r]
		int res = 0;

		// ������, ѭ����ֹ������������ r + 1 < s.length()

		while (r + 1 < s.length()) {

			if (r + 1 < s.length() && freq[s.charAt(r + 1)] == 0)
				freq[s.charAt(++r)]++;
			else // freq[s[r+1]] == 1
				freq[s.charAt(l++)]--;

			res = Math.max(res, r - l + 1);
		}

		return res;
	}

	// �������ڵ���һ��ʵ��
	public int lengthOfLongestSubstringV5(String s) {

		int[] freq = new int[256];

		int l = 0, r = -1; // ��������Ϊs[l...r]
		int res = 0;

		while (r + 1 < s.length()) {

			while (r + 1 < s.length() && freq[s.charAt(r + 1)] == 0)
				freq[s.charAt(++r)]++;

			res = Math.max(res, r - l + 1);

			if (r + 1 < s.length()) {
				freq[s.charAt(++r)]++;
				assert (freq[s.charAt(r)] == 2);
				while (l <= r && freq[s.charAt(r)] == 2)
					freq[s.charAt(l++)]--;
			}
		}

		return res;
	}

	// v6 lÿ�ο�����ǰ��Ծ, ����������+1
	// ��������, Ϊ�˻�������Ծ��λ��, ÿ����Ҫ�����������ڵ��ַ���
	public int lengthOfLongestSubstringV6(String s) {

		int l = 0, r = 0; // ��������Ϊs[l...r]
		int res = 0;

		while (r < s.length()) {

			int index = isDuplicateChar(s, l, r);

			// ���s[r]֮ǰ���ֹ�
			// l����ֱ������s[r+1]֮ǰ���ֵ�λ�� + 1�ĵط�
			if (index != -1)
				l = index + 1;

			res = Math.max(res, r - l + 1);
			r++;
		}

		return res;
	}

	// �鿴s[l...r-1]֮���Ƿ����s[r]
	// ������,������Ӧ������, ���򷵻�-1
	private int isDuplicateChar(String s, int l, int r) {
		for (int i = l; i < r; i++)
			if (s.charAt(i) == s.charAt(r))
				return i;
		return -1;
	}
}
