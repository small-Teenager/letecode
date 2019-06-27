package problems.algorithm.string;

import java.util.Stack;

/**
 * 
 * @author search yaodong199@icloud.com ÓÐÐ§µÄÀ¨ºÅ
 * 
 *         stack string
 */
public class IsValid_20 {

	// v1
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (char c : s.toCharArray()) {
			if (c == '(')
				stack.push(')');
			else if (c == '{')
				stack.push('}');
			else if (c == '[')
				stack.push(']');
			else if (stack.isEmpty() || stack.pop() != c)
				return false;
		}
		return stack.isEmpty();
	}

	// v2
	public boolean isValidV2(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++)
			if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
				stack.push(s.charAt(i));
			else {

				if (stack.size() == 0)
					return false;

				Character c = stack.pop();

				Character match;
				if (s.charAt(i) == ')')
					match = '(';
				else if (s.charAt(i) == ']')
					match = '[';
				else {
					assert s.charAt(i) == '}';
					match = '{';
				}

				if (c != match)
					return false;
			}

		if (stack.size() != 0)
			return false;

		return true;
	}
}
