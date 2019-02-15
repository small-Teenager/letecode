package problems.algorithm.array;

import java.util.LinkedList;
import java.util.List;

/**
 * 830. 较大分组的位置
 * 
 * @author search yaodong199@icloud.com
 */
public class LargeGroupPositions_830 {

	/**
	 * 1 <= S.length <= 1000
	 * 
	 * @param S
	 * @return
	 */
	public List<List<Integer>> largeGroupPositions(String S) {
		List<List<Integer>> res = new LinkedList<>();
		if (S.length() < 3)
			return res;
		List<Integer> list = null;
		int i = 0, j = 0;
		while (i < S.length()) {
			char ch = S.charAt(i);
			j = i;
			while (j < S.length() && S.charAt(j) == ch)
				++j;
			// record
			if ((j - i) >= 3) {
				list = new LinkedList<>();
				list.add(i);
				list.add(j - 1);
				res.add(list);
				i = j;
			} else {
				++i;
			}
		}
		return res;
	}

}
