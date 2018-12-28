package algorithm.stack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;
/**
 * 比较含退格的字符串
 * @author search
 *
 */
public class BackspaceCompare_844 {

	/**
	 * use deque
	 * 
	 * @param S
	 * @param T
	 * @return
	 */
	public boolean backspaceCompare(String S, String T) {
		Deque<Character> d1 = new LinkedList<>();
		Deque<Character> d2 = new LinkedList<>();
		for (Character s1 : S.toCharArray()) {
			if (Character.isLetter(s1))
				d1.push(s1);
			else if (!d1.isEmpty())
				d1.pop();
		}
		for (Character s2 : T.toCharArray()) {
			if (Character.isLetter(s2))
				d2.push(s2);
			else if (!d2.isEmpty())
				d2.pop();
		}
		String s1 = "", s2 = "";
		while (!d1.isEmpty())
			s1 += d1.pop();
		while (!d2.isEmpty())
			s2 += d2.pop();
		return s1.equals(s2);
	}

	/**
	 * use stack
	 * 
	 * @param S
	 * @param T
	 * @return
	 */
	public boolean backspaceCompare2(String S, String T) {
		Stack<Character> sStack = new Stack<>();
		Stack<Character> tStack = new Stack<>();

		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == '#') {
				if (!sStack.isEmpty()) {
					sStack.pop();
				}
			} else {
				sStack.push(S.charAt(i));
			}
		}

		for (int i = 0; i < T.length(); i++) {
			if (T.charAt(i) == '#') {
				if (!tStack.isEmpty()) {
					tStack.pop();
				}
			} else {
				tStack.push(T.charAt(i));
			}
		}

		StringBuffer sBuf = new StringBuffer();
		StringBuffer tBuf = new StringBuffer();

		while (!sStack.isEmpty()) {
			sBuf.append(sStack.pop());
		}

		while (!tStack.isEmpty()) {
			tBuf.append(tStack.pop());
		}

		return sBuf.toString().equals(tBuf.toString());
	}
}
