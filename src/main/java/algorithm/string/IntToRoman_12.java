package algorithm.string;

/**
 * 整数转罗马数字
 * 
 * @author search yaodong199@icloud.com
 */
public class IntToRoman_12 {

	public String intToRoman(int num) {
		char[][] roman = { { 'A', 'I', 'V', 'X' }, { 'A', 'X', 'L', 'C' }, { 'A', 'C', 'D', 'M' },
				{ 'A', 'M', 'A', 'A' } };
		int[] nine2Roman = { 0, 1, 11, 111, 12, 2, 21, 211, 2111, 13 };
		StringBuilder sb = new StringBuilder();
		int r = 0;
		while (num > 0) {
			int idx = nine2Roman[num % 10];
			while (idx > 0) {
				sb.append(roman[r][idx % 10]);
				idx /= 10;
			}
			num /= 10;
			r++;
		}
		return sb.reverse().toString();
	}

	public String intToRoman2(int num) {
		if (num >= 1000)
			return "M" + intToRoman(num - 1000);
		if (num >= 900)
			return "CM" + intToRoman(num - 900);
		if (num >= 500)
			return "D" + intToRoman(num - 500);
		if (num >= 400)
			return "CD" + intToRoman(num - 400);
		if (num >= 100)
			return "C" + intToRoman(num - 100);
		if (num >= 90)
			return "XC" + intToRoman(num - 90);
		if (num >= 50)
			return "L" + intToRoman(num - 50);
		if (num >= 40)
			return "XL" + intToRoman(num - 40);
		if (num >= 10)
			return "X" + intToRoman(num - 10);
		if (num >= 9)
			return "IX" + intToRoman(num - 9);
		if (num >= 5)
			return "V" + intToRoman(num - 5);
		if (num >= 4)
			return "IV" + intToRoman(num - 4);
		if (num >= 1)
			return "I" + intToRoman(num - 1);
		return "";
	}
}
