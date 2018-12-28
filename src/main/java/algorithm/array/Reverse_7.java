package algorithm.array;

/**
 * 反转整数
 * 
 * @author search yaodong199@icloud.com
 */
public class Reverse_7 {
	// method 1
	@SuppressWarnings("finally")
	public int reverse1(int x) {
		String s = Math.abs(x) + "";
		String sb = "";

		for (int i = s.length(); i > 0; i--) {
			if (s.charAt(i - 1) == 0) {
				continue;
			}
			sb += s.charAt(i - 1);
		}
		int outer = 0;
		try {
			outer = Integer.parseInt(sb);
		} finally {
			// TODO: handle finally clause
			if (outer > Integer.MAX_VALUE || outer < Integer.MIN_VALUE)
				return 0;
			return x > 0 ? outer : outer * -1;
		}
	}

	// Long method 2
	public int reverse2(int x) {
		if (x == Integer.MIN_VALUE)
			return 0;
		String s = Math.abs(x) + "";

		String sb = "";
		for (int i = s.length(); i > 0; i--) {
			if (s.charAt(i - 1) == 0) {
				continue;
			}
			sb += s.charAt(i - 1);
		}
		Long outer;
		outer = Long.parseLong(sb);
		if (outer > Integer.MAX_VALUE || outer < Integer.MIN_VALUE)
			return 0;
		return (int) (x > 0 ? outer : outer * -1);
	}
	
	/**
	 * method 3
	 * 1 取x的绝对值  x=Math.abs(x)
	 * 2 对str进行反转    str = String.valueOf(x)
	 * 				  str = new StringBuffer(str).reverse().toString()
	 * 3 将 str 转回 int    int res = Integer.parseInt(str)
	 * 4 x > 0 ? res : -res 
	 * @param x
	 * @return
	 */
}
