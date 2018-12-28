package algorithm.string;

/**
 * 二进制求和 67
 * 
 * @author search yaodong199@icloud.com
 */
public class AddBinary_67 {
	/**
	 * n进制求和
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public String addBinary(String a, String b) {
		char[] res = new char[Math.max(a.length(), b.length())];
		int carryBit = 0;
		for (int a1 = a.length() - 1, a2 = b.length() - 1; a1 >= 0 || a2 >= 0; --a1, --a2) {
			int c1 = a1 < 0 ? 0 : (a.charAt(a1) - '0');
			int c2 = a2 < 0 ? 0 : (b.charAt(a2) - '0');
			res[Math.max(a1, a2)] = (char) ((c1 + c2 + carryBit) % 2 + (int) '0');

			if ((c1 + c2 + carryBit) / 2 > 0)
				carryBit = 1;
			else
				carryBit = 0;
		}
		return (carryBit > 0 ? "1" : "") + new String(res);
	}
}
