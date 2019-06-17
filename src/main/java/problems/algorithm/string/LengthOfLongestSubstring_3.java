package problems.algorithm.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 
 * @author Search yaodong199@icloud.com 3. 无重复字符的最长子串
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
	 * 标签：滑动窗口 暴力解法时间复杂度较高，会达到 O(n^2)O(n 2 )，故而采取滑动窗口的方法降低时间复杂度 定义一个 map 数据结构存储 (k,
	 * v)，其中 key 值为字符，value 值为字符位置 +1，加 1 表示从字符位置后一个才开始不重复 我们定义不重复子串的开始位置为
	 * start，结束位置为 end 随着 end 不断遍历向后，会遇到与 [start, end] 区间内字符相同的情况，此时将字符作为 key 值，获取其
	 * value 值，并更新 start，此时 [start, end] 区间内不存在重复字符 无论是否更新 start，都会更新其 map 数据结构和结果
	 * ans。 时间复杂度
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

	// 滑动窗口
	public int lengthOfLongestSubstringV3(String s) {

		int[] freq = new int[256];

		int l = 0, r = -1; // 滑动窗口为s[l...r]
		int res = 0;

		// 整个循环从 l == 0; r == -1 这个空窗口开始
		// 到l == s.size(); r == s.size()-1 这个空窗口截止
		// 在每次循环里逐渐改变窗口, 维护freq, 并记录当前窗口中是否找到了一个新的最优值
		while (l < s.length()) {

			if (r + 1 < s.length() && freq[s.charAt(r + 1)] == 0)
				freq[s.charAt(++r)]++;
			else // r已经到头 || freq[s[r+1]] == 1
				freq[s.charAt(l++)]--;

			res = Math.max(res, r - l + 1);
		}

		return res;
	}

	// 滑动窗口
	public int lengthOfLongestSubstringV4(String s) {

		int[] freq = new int[256];

		int l = 0, r = -1; // 滑动窗口为s[l...r]
		int res = 0;

		// 在这里, 循环中止的条件可以是 r + 1 < s.length()

		while (r + 1 < s.length()) {

			if (r + 1 < s.length() && freq[s.charAt(r + 1)] == 0)
				freq[s.charAt(++r)]++;
			else // freq[s[r+1]] == 1
				freq[s.charAt(l++)]--;

			res = Math.max(res, r - l + 1);
		}

		return res;
	}

	// 滑动窗口的另一种实现
	public int lengthOfLongestSubstringV5(String s) {

		int[] freq = new int[256];

		int l = 0, r = -1; // 滑动窗口为s[l...r]
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

	// v6 l每次可以向前跳跃, 而不仅仅是+1
	// 但代价是, 为了获得这个跳跃的位置, 每次需要遍历整个窗口的字符串
	public int lengthOfLongestSubstringV6(String s) {

		int l = 0, r = 0; // 滑动窗口为s[l...r]
		int res = 0;

		while (r < s.length()) {

			int index = isDuplicateChar(s, l, r);

			// 如果s[r]之前出现过
			// l可以直接跳到s[r+1]之前出现的位置 + 1的地方
			if (index != -1)
				l = index + 1;

			res = Math.max(res, r - l + 1);
			r++;
		}

		return res;
	}

	// 查看s[l...r-1]之间是否存在s[r]
	// 若存在,返回相应的索引, 否则返回-1
	private int isDuplicateChar(String s, int l, int r) {
		for (int i = l; i < r; i++)
			if (s.charAt(i) == s.charAt(r))
				return i;
		return -1;
	}
}
