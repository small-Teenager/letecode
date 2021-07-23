package problems.algorithm.string;

/**
 * 报数
 * 
 * @author search yaodong199@icloud.com
 */
public class CountAndSay_38 {

	public String countAndSay(int n) {
		StringBuilder res_sb = new StringBuilder();
		res_sb.append("1");
		for (int k = 1; k < n; k++) {
			StringBuilder new_sb = new StringBuilder();

			char[] ca = res_sb.toString().toCharArray();
			int count = 0;
			char cur_char = ca[0];

			for (int j = 0; j < ca.length; j++) {
				if (cur_char == ca[j]) {
					count++;
				} else {
					new_sb.append(count);
					new_sb.append(cur_char);
					count = 1;
					cur_char = ca[j];
				}
			}
			new_sb.append(count);
			new_sb.append(cur_char);
			res_sb = new_sb;
		}

		return res_sb.toString();
	}
}
