package algorithm.string;

/**
 * 43. 字符串相乘
 * 
 * @author search yaodong199@icloud.com
 */
public class Multiply_43 {

	public static String multiply(String num1, String num2) {
		if (num1 == null || num2 == null)
			return "";
		if ("".equals(num1) || "".equals(num2) || "0".equals(num1) || "0".equals(num2))
			return "0";

		int m = num1.length();
		int n = num2.length();
		int[] arr = new int[m + n];
		for (int i = n - 1; i >= 0; i--) {
			for (int j = m - 1; j >= 0; j--) {
				int value = ((num1.charAt(j) - '0') * (num2.charAt(i) - '0')) + arr[j + i + 1];
				arr[j + i] += value / 10;
				arr[j + i + 1] = value % 10;
			}
		}
		// 组合数字
		StringBuilder sb = new StringBuilder();
		int k = 0;
		// 去掉首0
		while (k < arr.length && arr[k] == 0)
			k++;
		while (k < arr.length)
			sb.append(arr[k++]);
		return sb.toString();
	}

}
