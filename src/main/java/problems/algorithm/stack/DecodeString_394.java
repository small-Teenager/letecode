package problems.algorithm.stack;

import java.util.Stack;

/**
 * 394. 字符串解码
 * 
 * @author search
 *
 */
public class DecodeString_394 {
	
	public String decodeString(String s) {
		String res = "";
		Stack<Integer> countStack = new Stack<>();
		Stack<String> resStack = new Stack<>();
		int idx = 0;
		while (idx < s.length()) {
			if (Character.isDigit(s.charAt(idx))) {
				int count = 0;
				while (Character.isDigit(s.charAt(idx))) {
					count = 10 * count + (s.charAt(idx) - '0');
					idx++;
				}
				countStack.push(count);
			} else if (s.charAt(idx) == '[') {
				resStack.push(res);
				res = "";
				idx++;
			} else if (s.charAt(idx) == ']') {
				StringBuilder temp = new StringBuilder(resStack.pop());
				int repeatTimes = countStack.pop();
				for (int i = 0; i < repeatTimes; i++) {
					temp.append(res);
				}
				res = temp.toString();
				idx++;
			} else {
				res += s.charAt(idx++);
			}
		}
		return res;
	}
}
