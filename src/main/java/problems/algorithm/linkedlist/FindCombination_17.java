package problems.algorithm.linkedlist;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author search
 *
 */
public class FindCombination_17 {

	private String letterMap[] = { " ", // 0
			"", // 1
			"abc", // 2
			"def", // 3
			"ghi", // 4
			"jkl", // 5
			"mno", // 6
			"pqrs", // 7
			"tuv", // 8
			"wxyz" // 9
	};

	private ArrayList<String> res;

	public List<String> letterCombinations(String digits) {

		res = new ArrayList<String>();
		if (digits.equals(""))
			return res;

		findCombination(digits, 0, "");
		return res;
	}

	// s中保存了此时从digits[0...index-1]翻译得到的一个字母字符串
	// 寻找和digits[index]匹配的字母, 获得digits[0...index]翻译得到的解
	private void findCombination(String digits, int index, String s) {

		System.out.println(index + " : " + s);
		if (index == digits.length()) {
			res.add(s);
			System.out.println("get " + s + " , return");
			return;
		}

		Character c = digits.charAt(index);
		assert c.compareTo('0') >= 0 && c.compareTo('9') <= 0 && c.compareTo('1') != 0;
		String letters = letterMap[c - '0'];
		for (int i = 0; i < letters.length(); i++) {
			System.out.println("digits[" + index + "] = " + c + " , use " + letters.charAt(i));
			findCombination(digits, index + 1, s + letters.charAt(i));
		}

		System.out.println("digits[" + index + "] = " + c + " complete, return");

		return;
	}

	private static void printList(List<String> list) {
		for (String s : list)
			System.out.println(s);
	}

	public static void main(String[] args) {

		printList((new FindCombination_17()).letterCombinations("234"));
	}
}
