package algorithm.string;

import java.util.HashMap;

/**
 * 
 * @author search yaodong199@icloud.com 罗马数字转整数
 */
public class RomanToInt_13 {

	private static HashMap<Character, Integer> letterToValue = new HashMap<>();

	static {
		letterToValue.put('I', 1);
		letterToValue.put('V', 5);
		letterToValue.put('X', 10);
		letterToValue.put('L', 50);
		letterToValue.put('C', 100);
		letterToValue.put('D', 500);
		letterToValue.put('M', 1000);
		letterToValue.put('\0', 10001);// anything max
	}

	public int romanToInt(String s) {

		char[] charArray = s.toCharArray();
		int value = 0;
		char prev = '\0';

		for (char current : charArray) {
			value += letterToValue.get(current);
			if (letterToValue.get(current) > letterToValue.get(prev)) {
				value = value - 2 * letterToValue.get(prev);
			}
			prev = current;
		}
		return value;
	}

	// method two
	public int romanToInt2(String s) {
		int res = 0;
		if (s == null) {
			return res;
		}
		int index = 0;
		char c, n;
		while (index < s.length()) {
			c = s.charAt(index);
			n = index != s.length() - 1 ? s.charAt(index + 1) : ' ';
			if (c == 'I') {
				if (n == 'V' || n == 'X') {
					res -= 1;
				} else {
					res += 1;
				}
			} else if (c == 'X') {
				if (n == 'L' || n == 'C') {
					res -= 10;
				} else {
					res += 10;
				}
			} else if (c == 'C') {
				if (n == 'D' || n == 'M') {
					res -= 100;
				} else {
					res += 100;
				}
			} else if (c == 'V') {
				res += 5;
			} else if (c == 'L') {
				res += 50;
			} else if (c == 'D') {
				res += 500;
			} else if (c == 'M') {
				res += 1000;
			}
			index++;
		}
		return res;
	}
}
